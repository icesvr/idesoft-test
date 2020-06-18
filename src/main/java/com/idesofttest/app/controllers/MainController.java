package com.idesofttest.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.idesofttest.app.model.GenericResponse;
import com.idesofttest.app.services.MainServiceImpl;


@Controller
public class MainController {
	
	private static Logger logger = LogManager.getLogger(MainController.class);
	
	@Autowired
	private MainServiceImpl mainService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/comuna/{comuna}")
	public ResponseEntity<GenericResponse> getByComuna(@PathVariable("comuna") String comuna){
		logger.info("GET BY COMUNA CONTROLLER");
		return mainService.getByComuna(comuna);
	}
	
	
}
