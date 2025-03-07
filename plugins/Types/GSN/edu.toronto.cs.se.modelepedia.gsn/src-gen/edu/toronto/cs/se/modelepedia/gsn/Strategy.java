/*******************************************************************************
 * Copyright (c) 2017, 2022 Alessio Di Sandro, Nick Fung.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Alessio Di Sandro - Implementation
 *     Nick Fung - Implementation
 *******************************************************************************/
package edu.toronto.cs.se.modelepedia.gsn;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Strategy</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage#getStrategy()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StrategySupporter StrategyContext'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StrategySupporter='\n\t\t\tlet children : Set(Supporter) = self.supportedBy.target -&gt; closure(p | if p.oclIsKindOf(CoreElement) then p.oclAsSet() else p.oclAsType(Supportable).supportedBy.target endif) -&gt; asSet() \n\t\t\tin children -&gt; selectByKind(CoreElement) -&gt; forAll(s | s.oclIsKindOf(Goal) or s.oclIsKindOf(Solution))' StrategyContext='self.inContextOf.context -&gt; forAll(c | c.oclIsKindOf(Context) or c.oclIsKindOf(Assumption) or c.oclIsKindOf(Justification))'"
 * @generated
 */
public interface Strategy extends DecomposableCoreElement {
} // Strategy
