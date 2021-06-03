package com.asimio.api.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

@RestController
@RequestMapping(value = "/demo")
public class DemoResource {

	@RequestMapping(method = RequestMethod.GET)
	public String getDemo() {
		System.out.println("Thread.currentThread().getName() : "+ Thread.currentThread().getName());

		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "demo";
	}


	@RequestMapping(method = RequestMethod.GET,path = "/chandranshu")
	public ResponseEntity<String> getRetrysString() {

		System.out.println("Thread.currentThread().getName() : "+ Thread.currentThread().getName());

		return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);

//		throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);


	//	return "demo";
	}

	@RequestMapping(method = RequestMethod.POST,path = "/chandranshu")
	public ResponseEntity<String> getPostRetrysString() {

		System.out.println("Thread.currentThread().getName() : "+ Thread.currentThread().getName());


		return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);

//		throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);


		//	return "demo";
	}
}
