/*
 * Copyright (c) 2012-2023 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RelationalDatabase_MAVOModelingAssistantProviderOfTableEditPart extends
		edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.Column_3001);
		types.add(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.ForeignKey_3002);
		return types;
	}

}
