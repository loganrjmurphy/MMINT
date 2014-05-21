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
package edu.toronto.cs.se.modelepedia.z3.mavo;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;

public class EcoreMAVOToSMTLIBListener implements IAcceleoTextGenerationListener {

	private static final String NODE_MARKER = ";Node";
	private static final String EDGE_MARKER = ";Edge";
	private static final String MODEL_START_MARKER = ";Model\n";
	private static final String MODEL_END_MARKER = ";End Model\n";
	private static final int NUM_TOKENS = 4;

	private StringBuilder textGeneration;
	private String smtEncoding;
	private String smtEncodingUri;
	private Map<Integer, String> smtNodes;
	private Map<Integer, String> smtEdges;
	private Map<Integer, String> smtCurrentElems;
	private boolean checkTokens;
	private String[] smtTokens;
	int smtTokenCounter;

	public EcoreMAVOToSMTLIBListener() {

		textGeneration = new StringBuilder();
		smtNodes = new HashMap<Integer, String>();
		smtEdges = new HashMap<Integer, String>();
		checkTokens = false;
		smtTokens = new String[NUM_TOKENS];
		smtTokenCounter = NUM_TOKENS;
	}

	@Override
	public void textGenerated(AcceleoTextGenerationEvent event) {

		String text = event.getText();
		textGeneration.append(text);

		if (text.endsWith(MODEL_START_MARKER)) {
			checkTokens = true;
			return;
		}
		if (!checkTokens) {
			return;
		}
		if (text.endsWith(MODEL_END_MARKER)) {
			checkTokens = false;
			return;
		}

		if (smtTokenCounter < NUM_TOKENS) {
			smtTokens[smtTokenCounter] = text;
			smtTokenCounter++;
			if (smtTokenCounter == (NUM_TOKENS)) {
				smtCurrentElems.put(new Integer(smtTokens[NUM_TOKENS-1]), smtTokens[NUM_TOKENS-3]);
			}
		}
		else if (text.endsWith(NODE_MARKER) || text.endsWith(EDGE_MARKER)) {
			smtTokenCounter = 0;
			smtCurrentElems = (text.endsWith(NODE_MARKER)) ? smtNodes : smtEdges;
		}
	}

	@Override
	public void filePathComputed(AcceleoTextGenerationEvent event) {

		smtEncodingUri = event.getText();
	}

	@Override
	public void fileGenerated(AcceleoTextGenerationEvent event) {

		smtEncoding = textGeneration.toString();
	}

	@Override
	public void generationEnd(AcceleoTextGenerationEvent event) {

		// do nothing
	}

	@Override
	public boolean listensToGenerationEnd() {

		return false;
	}

	public String getSMTLIBEncoding() {

		return smtEncoding;
	}

	public String getSMTLIBEncodingUri() {

		return smtEncodingUri;
	}

	public Map<Integer, String> getSMTLIBNodes() {

		return smtNodes;
	}

	public Map<Integer, String> getSMTLIBEdges() {

		return smtEdges;
	}

}
