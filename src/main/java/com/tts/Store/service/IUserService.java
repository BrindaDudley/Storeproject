package com.tts.Store.service;

import com.tts.Store.domain.User;

public interface IUserService  {

	void addUser(User user);

	User getLoggedInUser();

	User findByUserName(String userName);

}
