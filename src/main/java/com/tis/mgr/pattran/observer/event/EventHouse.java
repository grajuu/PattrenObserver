/**
 * 
 */
package com.tis.mgr.pattran.observer.event;

import java.util.ArrayList;
import java.util.List;

import com.tis.mgr.pattran.observer.executer.ObserverEvent;

/**
 * @author mardubudi
 *
 */
public class EventHouse {
	
	private List<ObserverEvent> event_listeners = new ArrayList<ObserverEvent>();
	private String activity ;
	

	public String getActivity() {
		return activity;
	}
	
	public void setActivity(String activity) {
		this.activity = activity;
		notifyEvenToHouse();
		
	}
	
	public void addEventToHouse(ObserverEvent observerEvent) {
	event_listeners.add(observerEvent);
	}
	
	public void notifyEvenToHouse() {
		
		for(ObserverEvent event:event_listeners) {
			event.eventListiner();
		}
	}
	

}
