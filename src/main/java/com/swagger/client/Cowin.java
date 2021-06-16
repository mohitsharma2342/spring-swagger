package com.swagger.client;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.swagger.model.Center;


@FeignClient(url="https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/calendarByDistrict",name="USER-CLIENT")
public interface Cowin {

	@GetMapping()
	public Map<String, List<Center>> getCenters(@RequestParam("district_id")String district_id,
			@RequestParam("date")String date);
}
