package com.training.postgressql.service;

import com.training.postgressql.repository.UserRepository;

public class UserService {

	private UserRepository repository = new UserRepository();
	
	public void displayUserName(String id) {
		String userName = repository.findUserName(id);
		System.out.println("USERNAME: " + userName);
	}
}


