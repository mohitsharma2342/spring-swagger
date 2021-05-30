package com.swagger.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.swagger.model.User;

@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface Client {

	
	@GetMapping("/users")
	public List<User> getUsers();
} 	
