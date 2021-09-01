package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	public String myResponse(){
		AddressBook addressBook = new AddressBook();
		return addressBook.toString();
	}
//	public String myReply(@RequestParam(value =  "myCompliment", defaultValue = "hair") String compliment){
//		return "I like your " + compliment + " too";
//	}

}
