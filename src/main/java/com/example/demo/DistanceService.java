package com.example.demo;

import java.io.IOException;

import org.springframework.stereotype.Service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class DistanceService {

	
	private static final String API_KEY = " ";
    OkHttpClient client = new OkHttpClient();
	public String distanceCalculation(DistanceCalculationDTO request)  throws IOException  {

	        String url = "https://maps.googleapis.com/map/api/distancematrix/json?origins=" +
	        request.getOrigin() + "&destination" + request.getDestination() + API_KEY;
	        Request request2 = new Request.Builder()
	            .url(url)
	            .build();

	        Response response = client.newCall(request2).execute();
	        
	        System.out.println(response.body().string());
	        System.out.println(response.body().string());
	        return response.body().string();
	        
	        
	        
	        
	    
	    }
		
		
	
	
		
	}
	
	


