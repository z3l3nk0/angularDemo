package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/hello/")
public class HelloController {
	
	List<Greeting> list = null;
	
    @RequestMapping(method = RequestMethod.GET, path = "/greeting", produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Greeting> index(@RequestParam(required=false, defaultValue="World") String name) {
    	 
        return initList();
    }

	private List<Greeting> initList() {
		if(list != null) {
			return list;
		}
		list = new ArrayList<>();
		list.add(new Greeting(new Random().nextInt(), "adasd"));
		list.add(new Greeting(new Random().nextInt(), "3fasf"));
		list.add(new Greeting(new Random().nextInt(), "12sdafa"));
		list.add(new Greeting(new Random().nextInt(), "6hfghdg"));
		
		return list;
	}

}