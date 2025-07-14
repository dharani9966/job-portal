package com.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobportal.model.User;


@Service
public interface UserService {
	
	
	public  User saveUser(User user);
	public User updateUser(User user);
	public void deleteUser(User user);
	public User findById(long id);
	public List<User>findall();


}
