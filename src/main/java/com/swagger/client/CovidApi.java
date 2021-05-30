package com.swagger.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.swagger.model.Global;

@FeignClient(url="https://api.covid19api.com",value="COVID-API")
public interface CovidApi {

	@GetMapping("/summary")
	public Global getCountryCases();
	
}
