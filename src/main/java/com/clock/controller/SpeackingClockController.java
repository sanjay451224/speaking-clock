package com.clock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clock.model.SpeakingCock;
import com.clock.service.SpeakingService;

@RestController
public class SpeackingClockController {
	
	@Autowired
	private SpeakingService speackingService;
	
	
	@GetMapping("/get")
	public String getTimeIntoWord(@RequestBody SpeakingCock speakingclock) {
		return speackingService.getTime(speakingclock.getTime());
	}

}
