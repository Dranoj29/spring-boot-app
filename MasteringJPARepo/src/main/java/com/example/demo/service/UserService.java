package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import com.example.demo.model.User;

public interface UserService {

	void addUser(User user);
	List<User> findAll();
	Optional<User> findById(long id);
	Page<User> findAllPageable(int from, int to);
	List<User> findAllUserList(int from, int to);
	Slice<User> findAllUserSlice(int from, int to);
	void updateUser(User user);
	void deleteUser(long id);
	Optional<User> findByUsername(String username);
	
}
