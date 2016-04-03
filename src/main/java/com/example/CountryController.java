package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/country/")
public class CountryController {
	
	private List<Country> countries = null;
	
    @RequestMapping(method = RequestMethod.GET, path = "/country", produces= MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Country> readAll(@RequestParam(required=false, defaultValue="World") String name) {
    	initCountries();
		return countries;
	}

	private void initCountries() {
		if(countries != null) {
			return;
		}
		
		countries = new ArrayList<>();
		Country country = new Country(1, "asdasd", 123123, 1111);
		Country country1 = new Country(2, "a22222sdasd", 123123, 1111);
		Country country2 = new Country(3, "asda3333333sd", 123123, 1111);
		countries.add(country);
		countries.add(country1);
		countries.add(country2);
	}
	

}
