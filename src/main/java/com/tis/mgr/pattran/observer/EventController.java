/**
 * 
 */
package com.tis.mgr.pattran.observer;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tis.mgr.pattran.observer.event.EventHouse;
import com.tis.mgr.pattran.observer.event.MobileEvent;

/**
 * @author mardubudi
 *
 */
@RestController
public class EventController {
	
	Logger _logger = Logger.getLogger(EventController.class.getName());
	
	@GetMapping("/trigger/{event}")
	public String triggerController(@PathVariable("event") String event ) {
		
		_logger.info("***  Observer event controller  ***");
         EventHouse eventHouse = new EventHouse();

         new MobileEvent(eventHouse).eventListiner();
         
		return event;}

}
