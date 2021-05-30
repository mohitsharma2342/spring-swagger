package com.swagger.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.swagger.client.Client;
import com.swagger.client.CovidApi;
import com.swagger.model.Country;
import com.swagger.model.Global;
import com.swagger.model.User;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	@Autowired
	private Client client;
	
	@Autowired
	private CovidApi covidApi;

	@GetMapping("/findAllUser")
	public List<User> getAllUser() {
		return client.getUsers();
	}
	
	@GetMapping("/covid-global")
	public Global getCountryCases() {
		return covidApi.getCountryCases();
	}
	
	@GetMapping("/covid-groupby-country")
	public Map<Object, List<Country>> groupByContry() {
		
		Map<Object, List<Country>> country= covidApi.getCountryCases().getCountries()
				.stream().collect(Collectors.groupingBy(a->a.getCountry()));
		return country;
	}
	
	@GetMapping("/covid-country")
	public  Optional<Country> findByContry(@RequestParam("countryName")String countryName ) {	
		 Optional<Country> country= covidApi.getCountryCases().getCountries()
				.stream().filter(c->c.getCountry().equals(countryName)).findAny();
		return country;
	}
}
