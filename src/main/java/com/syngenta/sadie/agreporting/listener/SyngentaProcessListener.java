package com.syngenta.sadie.agreporting.listener;
import org.kie.api.event.process.ProcessEventListener;

import java.util.logging.Logger;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
 

/**
	Process listener, handling all events on processes at runtime
**/
public class SyngentaProcessListener implements ProcessEventListener {
	private static Logger logger = Logger.getLogger(SyngentaProcessListener.class.getName());

	public void beforeNodeLeft(ProcessNodeLeftEvent evt) {
		logger.info("-- beforeNodeLeft: "+evt.getNodeInstance().getNodeName());
	}

	public void beforeNodeTriggered(ProcessNodeTriggeredEvent evt) {
		logger.info("-- beforeNodeTriggered: "+evt.getNodeInstance().getNodeName());
	}

	public void beforeProcessCompleted(ProcessCompletedEvent evt) {		
		logger.info("Process '"+evt.getProcessInstance().getProcessName()+"' with Id "+evt.getProcessInstance().getId()+" was completed");
	}

	public void beforeProcessStarted(ProcessStartedEvent evt) {	
		logger.info("Process '"+evt.getProcessInstance().getProcessName()+"' was started with Id "+evt.getProcessInstance().getId());		
	}

	public void beforeVariableChanged(ProcessVariableChangedEvent evt) {
		logger.info("-- beforeVariableChanged: "+evt.getOldValue() + " -> "+evt.getNewValue());
	}

	public void afterNodeLeft(ProcessNodeLeftEvent evt) {		
	}

	public void afterNodeTriggered(ProcessNodeTriggeredEvent evt) {
	}

	public void afterProcessCompleted(ProcessCompletedEvent evt) {
	}

	public void afterProcessStarted(ProcessStartedEvent evt) {	
	}

	public void afterVariableChanged(ProcessVariableChangedEvent evt) {	
	}
} 
