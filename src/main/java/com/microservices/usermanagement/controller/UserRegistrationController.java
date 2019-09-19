package com.microservices.usermanagement.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.usermanagement.dto.UserDto;
import com.microservices.usermanagement.requestmodel.UserRequest;
import com.microservices.usermanagement.responsemodel.UserResponse;
import com.microservices.usermanagement.service.UserService;

@RestController
@RequestMapping("/userregistration")
public class UserRegistrationController {

	@Autowired
	UserService userService;
	
	@PostMapping
	public UserResponse register(@RequestBody UserRequest request) {
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(request, userDto);
		userDto = this.userService.save(userDto);
		
		UserResponse response = new UserResponse();
		BeanUtils.copyProperties(userDto, response);
		
		return response;
	}
	
}
