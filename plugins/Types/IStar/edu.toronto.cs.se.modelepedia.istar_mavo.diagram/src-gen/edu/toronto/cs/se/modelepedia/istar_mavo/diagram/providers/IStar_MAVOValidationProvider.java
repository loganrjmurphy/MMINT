/*
 * Copyright (c) 2012-2022 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.istar_mavo.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class IStar_MAVOValidationProvider {

	/**
	* @generated
	*/
	private static boolean constraintsActive = false;

	/**
	* @generated
	*/
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	* @generated
	*/
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				edu.toronto.cs.se.modelepedia.istar_mavo.diagram.part.IStar_MAVODiagramEditorPlugin.getInstance()
						.logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	* @generated
	*/
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& edu.toronto.cs.se.modelepedia.istar_mavo.diagram.edit.parts.IStarEditPart.MODEL_ID
							.equals(edu.toronto.cs.se.modelepedia.istar_mavo.diagram.part.IStar_MAVOVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

}
