package com.tts.Store.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tts.Store.domain.Role;
import com.tts.Store.domain.RoleName;
import com.tts.Store.domain.User;
import com.tts.Store.repository.RoleRepository;
import com.tts.Store.repository.UserRepository;

@Service
public class UserService implements IUserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private RoleRepository roleRepository;

	public void addUser(User user) {
		// TODO Auto-generated method stub

		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(true);
		HashSet<Role> role = new HashSet<Role>();
		List<Role> userRole = roleRepository.findByRoleNameIn(Arrays.asList(RoleName.USER, RoleName.SELLER));

		role.addAll(userRole);
		user.setRoles(role);
		userRepository.save(user);

	}

	@Override
	public User findByUserName(String userName) {
		System.out.println("User requested");
		return userRepository.findByUserName(userName);
	}

	@Override
	public User getLoggedInUser() {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();
		return findByUserName(userName);
	}
}
