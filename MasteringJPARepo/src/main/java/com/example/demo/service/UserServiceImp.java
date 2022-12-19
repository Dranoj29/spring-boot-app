package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserRepo userRepo;

	@Override
	public void addUser(User user) {
		userRepo.save(user);	
	}

	@Override
	public List<User> findAll() {
		
		return userRepo.findAll();
	}

	@Override
	public Optional<User> findById(long id) {
		return userRepo.findById(id);
	}

	@Override
	public Page<User> findAllPageable(int from, int to) {
		Pageable pageable = PageRequest.of(from, to);
		
		return userRepo.findAll(pageable);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	@Override
	public void deleteUser(long id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public Slice<User> findAllUserSlice(int from, int to) {
		Pageable pageable = PageRequest.of(from, to);
		return userRepo.findAllUserSlice(pageable);
	}

	@Override
	public List<User> findAllUserList(int from, int to) {
		Pageable pageable = PageRequest.of(from, to, Sort.by("id").descending());
		return userRepo.findAllUserList(pageable);
	}

	@Override
	public Optional<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepo.findByUsername(username);
	}
	
	
	

}
