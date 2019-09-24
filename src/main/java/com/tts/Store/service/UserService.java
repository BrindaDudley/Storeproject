package com.tts.Store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.Store.domain.User;
import com.tts.Store.repository.UserRepository;

@Service
public class UserService implements IUserService {
	@Autowired
	UserRepository userRepository;

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

}
