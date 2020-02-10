package com.spring.boot.service;

import com.spring.boot.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
}
