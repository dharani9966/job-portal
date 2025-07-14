package com.jobportal.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.User;
import com.jobportal.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/home")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user)
	{
		
		userService.saveUser(user);
		return "Registration sucessfull";
		
	}
	@PutMapping("/register")
	public String UpdateUser(@RequestBody User user)
	{
		userService.updateUser(user);
		
		return "Update sucessfull";
	}
	
	@GetMapping("/user/{id}")
	public User  getUser(@PathVariable("id") int id)
	{
		
		User user =userService.findById(id);
		return user;
		
	}
	
	@DeleteMapping("/user/{id}")
	public  void  deleteUser(@PathVariable("id")int id)
	{
		User user = userService.findById(id);
		userService.deleteUser(user);
		
	}

}
