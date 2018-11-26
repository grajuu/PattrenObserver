/**
 * 
 */
package com.tis.mgr.pattran.observer.executer;

import java.util.logging.Logger;

import com.tis.mgr.pattran.observer.event.EventHouse;

/**
 * @author mardubudi
 *
 */
public interface ObserverEvent {

	// Event that we want notify the actions
	Logger logger = Logger.getLogger(ObserverEvent.class.getName());

	EventHouse eventHouse = null;

	default public void eventListiner() {
		logger.info("Tracking of events happing in all components configured ");
	}

}
