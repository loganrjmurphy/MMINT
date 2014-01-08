/*
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
package edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RelationalDatabase_MAVOPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createColumn1CreationTool());
		paletteContainer.add(createForeignKey2CreationTool());
		paletteContainer.add(createTable3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createForeignColumnReference1CreationTool());
		paletteContainer.add(createTableColumnReference2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createColumn1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.Column1CreationTool_title,
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.Column1CreationTool_desc,
				Collections
						.singletonList(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.Column_3001));
		entry.setId("createColumn1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes
				.getImageDescriptor(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.Column_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForeignKey2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.ForeignKey2CreationTool_title,
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.ForeignKey2CreationTool_desc,
				Collections
						.singletonList(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.ForeignKey_3002));
		entry.setId("createForeignKey2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes
				.getImageDescriptor(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.ForeignKey_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.Table3CreationTool_title,
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.Table3CreationTool_desc,
				Collections
						.singletonList(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.Table_2001));
		entry.setId("createTable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes
				.getImageDescriptor(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.Table_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForeignColumnReference1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.ForeignColumnReference1CreationTool_title,
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.ForeignColumnReference1CreationTool_desc,
				Collections
						.singletonList(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.ForeignColumnReference_4002));
		entry.setId("createForeignColumnReference1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes
				.getImageDescriptor(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.ForeignColumnReference_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTableColumnReference2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.TableColumnReference2CreationTool_title,
				edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.Messages.TableColumnReference2CreationTool_desc,
				Collections
						.singletonList(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.TableColumnReference_4001));
		entry.setId("createTableColumnReference2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes
				.getImageDescriptor(edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.providers.RelationalDatabase_MAVOElementTypes.TableColumnReference_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
