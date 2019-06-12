package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController  {
	
	@Autowired
	  private  DistanceService distanceService;
	  
	
	@PostMapping("/distance")
	  public ResponseEntity<String> calculate(
	            @RequestBody DistanceCalculationDTO request) throws IOException {
	        String response = distanceService.distanceCalculation(request);
	       try{
	          return new ResponseEntity<>(response, HttpStatus.OK);
	       } catch (Exception e){
	           return new ResponseEntity<>(response, HttpStatus.OK);
	       }

	    }

}
