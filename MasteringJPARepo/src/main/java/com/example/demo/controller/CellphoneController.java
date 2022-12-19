package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cellphone;

@RestController
@RequestMapping("api/v1/")
public class CellphoneController {

	@GetMapping("cellphones")
	public List<Cellphone> cellphones() {
		
		return null;
	}
	
	@GetMapping("cellphone/{id}")
	public Optional<Cellphone> cellphone(@PathVariable int id) {
		
		return null;
	}
	
	
}
