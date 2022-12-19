package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class Appcontroller {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/users")
	public List<User> findAll() {
		
		return userService.findAll();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> findById(@PathVariable long id) {
		
		return userService.findById(id);
	}
	
	@GetMapping("/username/{username}")
	public Optional<User> findByUsername(@PathVariable String username) {
		
		return userService.findByUsername(username);
	}
	
	@GetMapping("/users/page/{from}/{to}")
	public Page<User> findAllPageable(@PathVariable("from") int from, @PathVariable("to") int to) {
		
		return userService.findAllPageable(from, to);
	}
	
	@GetMapping("/users/slice/{from}/{to}")
	public Slice<User> findAllSlice(@PathVariable("from") int from, @PathVariable("to") int to) {
		
		return userService.findAllUserSlice(from, to);
	}
	
	@GetMapping("/users/{from}/{to}")
	public List<User> findAllList(@PathVariable("from") int from, @PathVariable("to") int to) {
		
		return userService.findAllUserList(from, to);
	}
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable long id) {
		userService.deleteUser(id);
	}
}
