package com.example.sampleapp.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

@RestController 
@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getHello() {
	return "Hello from Server" + "\n";
	}

	@RequestMapping(value = "/hello/{paramId}", method = RequestMethod.GET)
	public String getHelloWithParam(@PathVariable String paramId) {
	System.out.print("id is " + paramId);
	return "Hello from Server with Param : " + paramId + "\n";
	}
	@RequestMapping(value = "/siva/{paramId}", method = RequestMethod.GET)
	public String getSivaWithParam(@PathVariable String paramId) {
	System.out.print("id is " + paramId);
	return "Hello from siva with Param : " + paramId + "\n";
	}
	@RequestMapping(value = "/devops", method = RequestMethod.GET)
        public String getDevops() {
        return "Hello from Devops Server" + "\n";
        }
	@RequestMapping(value = "/devops/{paramId}", method = RequestMethod.GET)
        public String getDevopsWithParam(@PathVariable String paramId) {
        System.out.print("id is " + paramId);
        return "Hello from  Devops Server with Param : " + paramId + "\n";
        }
	@RequestMapping(value = "/parse", method = RequestMethod.GET)
        public String getParse() {
        return "Hello from parse Server" + "\n";
        }

}
