/*******************************************************************************
 * Copyright (c) 2021, 2023 Alessio Di Sandro.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Alessio Di Sandro - Implementation
 *******************************************************************************/
package edu.toronto.cs.se.mmint.productline.design;

import org.eclipse.emf.ecore.EObject;

import edu.toronto.cs.se.mmint.productline.Attribute;
import edu.toronto.cs.se.mmint.productline.Class;
import edu.toronto.cs.se.mmint.productline.PLElement;
import edu.toronto.cs.se.mmint.productline.ProductLineUtils;
import edu.toronto.cs.se.mmint.productline.Reference;

/**
 * The services class used by VSM.
 */
public class Services {

    public String getPLElementLabel(EObject self) {
      var type = "";
      if (self instanceof Class c) {
        type = c.getType().getName();
      }
      else if (self instanceof Attribute a) {
        type = a.getType().getName();
      }
      else if (self instanceof Reference r) {
        type = r.getType().getName();
      }

      return type + " " + ProductLineUtils.getPresenceConditionLabel((PLElement) self, true);
    }
}
