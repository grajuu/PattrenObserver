/**
 * 
 */
package com.tis.mgr.pattran.observer.event;

import java.util.logging.Logger;

import com.tis.mgr.pattran.observer.executer.ObserverEvent;

/**
 * @author mardubudi
 *
 */
public class MobileEvent implements ObserverEvent {
	
	private Logger _logger = Logger.getLogger(MobileEvent.class.getName());
	
	EventHouse eventHouse;

	public MobileEvent(EventHouse eventHouse) {
		this.eventHouse = eventHouse;
		this.eventHouse.addEventToHouse(this);
	}

	@Override
	public void eventListiner() {
		_logger.info("******** This event from mobile ********");
	}

}
