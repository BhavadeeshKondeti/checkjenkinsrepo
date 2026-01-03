package com.excelr.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	
	//normal rest api
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg()
	{
		String s1="welcome to rest apis...";
		return new  ResponseEntity<String>(s1,HttpStatus.OK);
	}
	
	//rest api with PathVariable
	@GetMapping("/wish/{name}")
	public ResponseEntity<String> wishMsg(@PathVariable String name)
	{
		String s2="Hello "+name+" how are you everything is fine??";
		return new ResponseEntity<String>(s2,HttpStatus.OK);
	}
	
	//rest api with RequestParam
	@GetMapping("/loc")
	public ResponseEntity<String> perMsg(@RequestParam String name,@RequestParam String city)
	{
		String s3="Hi "+name+" iam from "+city;
		return new ResponseEntity<String>(s3,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	

}
