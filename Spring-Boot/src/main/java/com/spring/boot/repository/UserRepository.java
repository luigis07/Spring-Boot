package com.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//	public Set<User> findByUsername(String username);
	
//	public Iterable<User> findAllByStatus(String status);
}
