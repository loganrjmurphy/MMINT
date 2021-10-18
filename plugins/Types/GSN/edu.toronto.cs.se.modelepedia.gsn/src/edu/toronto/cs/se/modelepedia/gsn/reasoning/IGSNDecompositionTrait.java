/*******************************************************************************
 * Copyright (c) 2020, 2021 Alessio Di Sandro.
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
package edu.toronto.cs.se.modelepedia.gsn.reasoning;

import java.util.List;
import java.util.Map;

import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.mid.Model;
import edu.toronto.cs.se.mmint.mid.reasoning.IReasoner;
import edu.toronto.cs.se.modelepedia.gsn.PropertyDecompositionStrategy;
import edu.toronto.cs.se.modelepedia.gsn.reasoning.IGSNLeanEncoder.PropertyTemplate;

/**
 * The specification of a reasoning trait to decompose GSN goals.
 *
 * @author Alessio Di Sandro
 */
public interface IGSNDecompositionTrait extends IReasoner {

  /**
   * Gets a set of predefined template properties that are available for the input model, to be used in a property
   * decomposition, grouped by categories.
   *
   * @param model
   *          The model for which template properties are applicable.
   * @return A map of categories to lists of template properties.
   * @throws MMINTException
   *           If there is no encoder available for the input model.
   */
  Map<String, List<PropertyTemplate>> getTemplateProperties(Model model) throws MMINTException;

  /**
   * Validates the correctness of a GSN property decomposition.
   *
   * @param strategy
   *          The GSN property decomposition strategy.
   * @throws Exception
   *           If the validation fails.
   */
  void validatePropertyDecomposition(PropertyDecompositionStrategy strategy) throws Exception;
}
