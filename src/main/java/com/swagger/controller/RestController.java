package com.swagger.controller;

import java.util.ArrayList;
import java.util.Comparator;
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
import com.swagger.client.Cowin;
import com.swagger.model.Center;
import com.swagger.model.Country;
import com.swagger.model.Global;
import com.swagger.model.Session;
import com.swagger.model.User;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	@Autowired
	private Client client;
	
	@Autowired
	private CovidApi covidApi;
	@Autowired
	private Cowin cowin;;

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
	
	
	@GetMapping("/covid-country-asc")
	public  List<Country> findByContryASc() {	
		 List<Country> country= covidApi.getCountryCases().getCountries()
				.stream().sorted(Comparator.comparing(Country::getCountry)).collect(Collectors.toList());
		return country;
	}
	
	
	@GetMapping("/cowin-centers")
	public  List<Center> getCenters() {	
		 Map<String, List<Center>> centers= cowin.getCenters("355", "31-05-2021");
		
		 List<Center> centers1 = centers.get("centers").stream().collect(Collectors.toList());
		 List<Center> center18Plus = new ArrayList<>();
		 for (Center center : centers1) {
			for (Session session : center.getSessions()) {
				if(String.valueOf(session.getMinAgeLimit()).equals("18")) {
					center18Plus.add(center);
				}
			} 
		}
	/*	 centers.get("centers").stream().map(a->a.getSessions()).flatMap(a->a.stream()).
		 filter(s->String.valueOf(s.getMinAgeLimit()).equals("18")).collect(Collectors.toList());*/
		 return center18Plus;
	}
	
	
}
