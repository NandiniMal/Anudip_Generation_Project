package com.example.service;

import com.example.model.UserDetails;

public interface UserService {
	

		public UserDetails createUser(UserDetails user);

		public boolean checkEmail(String email);

	}


