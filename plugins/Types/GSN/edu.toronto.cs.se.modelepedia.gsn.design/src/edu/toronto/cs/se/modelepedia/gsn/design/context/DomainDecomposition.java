/**
 * Copyright (c) 2012-2020 Alessio Di Sandro, Marsha Chechik.
 * All rights reserved. This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Alessio Di Sandro - Implementation
 */
package edu.toronto.cs.se.modelepedia.gsn.design.context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.mid.ui.MIDDialogs;
import edu.toronto.cs.se.modelepedia.gsn.DecompositionStrategy;
import edu.toronto.cs.se.modelepedia.gsn.EnumDomain;
import edu.toronto.cs.se.modelepedia.gsn.GSNPackage;
import edu.toronto.cs.se.modelepedia.gsn.Goal;
import edu.toronto.cs.se.modelepedia.gsn.IntDomain;
import edu.toronto.cs.se.modelepedia.gsn.RealDomain;
import edu.toronto.cs.se.modelepedia.gsn.SafetyCase;
import edu.toronto.cs.se.modelepedia.gsn.util.DomainBuilder;

public class DomainDecomposition extends GoalDecomposition {

  @Override
  public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
    var goal = (Goal) ((DSemanticDecorator) arg0.iterator().next()).getTarget();
    var sSession = SessionManager.INSTANCE.getSession(goal);
    var sDomain = sSession.getTransactionalEditingDomain();
    sDomain.getCommandStack().execute(new DomainDecompositionCommand(sDomain, goal));
  }

  private class DomainDecompositionCommand extends GoalDecompositionCommand {

    public DomainDecompositionCommand(TransactionalEditingDomain domain, Goal decomposed) {
      super(domain, decomposed, new DomainBuilder((SafetyCase) decomposed.eContainer()));
    }

    @Override
    protected DecompositionStrategy decompose() throws Exception {
      var builder = (DomainBuilder) this.builder;
      // ask for input
      var title = "Domain Decomposition";
      var numDomains = 0;
      Set<Integer> subDomainTypes = null;
      var domain = builder.createDomain(title, "Insert the domain",
                                        Set.of(GSNPackage.INT_DOMAIN, GSNPackage.REAL_DOMAIN, GSNPackage.ENUM_DOMAIN));
      if (domain instanceof IntDomain || domain instanceof RealDomain) {
        var message = "Insert the number of sub-domains";
        numDomains = Integer.parseInt(MIDDialogs.getStringInput(title, message, null));
        if (numDomains <= 1) {
          throw new MMINTException("A domain must be decomposed into >1 sub-domains");
        }
        if (domain instanceof IntDomain) {
          subDomainTypes = Set.of(GSNPackage.INT_DOMAIN, GSNPackage.ENUM_DOMAIN, GSNPackage.VALUE_DOMAIN);
        }
        else if (domain instanceof RealDomain) {
          subDomainTypes = Set.of(GSNPackage.REAL_DOMAIN);
        }
      }
      else if (domain instanceof EnumDomain) {
        numDomains = ((EnumDomain) domain).getValues().size();
        subDomainTypes = Set.of(GSNPackage.ENUM_DOMAIN, GSNPackage.VALUE_DOMAIN);
      }
      // create decomposition template
      var id = this.decomposed.getId();
      var desc = this.decomposed.getDescription();
      var strategyId = "S-" + id;
      var justId = "J-" + id;
      var subGoalId = id + "-";
      var compGoalId = id + "-C";
      var strategyDesc = "Decomposition over domain " + domain.toString();
      var justDesc = "Every scenario has a corresponding value in the domain " + domain.toString();
      var subGoalDesc = desc + " for sub-domain ";
      var compGoalDesc = "Every possible value in the domain " + domain.toString() + " is covered by sub-domains ";
      var strategy = builder.createDomainStrategy(strategyId, strategyDesc, domain);
      builder.createJustification(strategy, justId, justDesc);
      var subDomains = new ArrayList<String>();
      for (var i = 0; i < numDomains; i++) {
        var subDomain = builder.createDomain(title, "Insert the sub-domain #" + (i+1), subDomainTypes);
        subDomains.add(subDomain.toString());
        var subGoal = builder.createDomainGoal(subGoalId + i, subGoalDesc + subDomain.toString(), subDomain);
        builder.addSupporter(strategy, subGoal);
      }
      var goal = builder.createBasicGoal(compGoalId, compGoalDesc + String.join(", ", subDomains));
      builder.addSupporter(strategy, goal);
      builder.addSupporter(this.decomposed, strategy);

      return strategy;
    }
  }
}
