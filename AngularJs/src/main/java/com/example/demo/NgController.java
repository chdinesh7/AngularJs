package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class NgController {
	@Autowired
	   public NgService ngService;
	@RequestMapping(value="/c")	
	 public String app1() {
		return "index.html";
	}
	 @RequestMapping(value="/d" )
	 public String app2(@RequestParam("user") String user,@RequestParam("pass") String pass) {
		 if(user == "admin" && pass == "1234") {
			 System.out.println("welcome");
		 }
			return "main.html";
		}
	 
	 @PostMapping("/insert")
	 public Model web( @RequestBody Model model) {	    	
	        return ngService.in(model);        
	    }

}
