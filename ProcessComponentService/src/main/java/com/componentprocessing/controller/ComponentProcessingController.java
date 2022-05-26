package com.componentprocessing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.componentprocessing.entity.CompleteRequest;
import com.componentprocessing.entity.ProcessRequest;
import com.componentprocessing.entity.ProcessResponse;
import com.componentprocessing.service.ComponentProcessingService;

@RestController
public class ComponentProcessingController {
	
	@Autowired
	ComponentProcessingService service;
	
	
	@GetMapping("/requestDetail")
	public ProcessResponse getProcessDetails(@RequestBody ProcessRequest processRequest) {
		return service.getProcessDetails(processRequest);
	}
	
	@PostMapping("/completeRequest")
	public String completeProcessing(@RequestBody CompleteRequest completeRequest) {
	

		return service.completeProcessing(completeRequest);
		
	}
}
