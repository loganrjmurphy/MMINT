/**
 * Copyright (c) 2012-2014 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.ecore.ui;

import org.eclipse.emf.ecoretools.diagram.part.EcoreCreationWizardPage;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.widgets.Shell;

import edu.toronto.cs.se.mmtf.mid.ui.EditorCreationWizardDialog;

public class EcoreDiagramCreationWizardDialog extends EditorCreationWizardDialog {

	@Override
	protected void storeCreatedModelUri(IWizardPage page) {

		EcoreCreationWizardPage filePage = (EcoreCreationWizardPage) page;
		createdModelUri = filePage.getDomainModelURI().toPlatformString(true);
	}

	/**
	 * Constructor: initialises the superclass.
	 * 
	 * @param parentShell
	 *            The parent shell.
	 * @param newWizard
	 *            The wizard.
	 */
	public EcoreDiagramCreationWizardDialog(Shell parentShell, IWizard newWizard) {

		super(parentShell, newWizard);
	}

}
