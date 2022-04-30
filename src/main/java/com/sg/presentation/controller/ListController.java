package com.sg.presentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sg.presentation.model.DTO;
import com.sg.presentation.repository.DAO;

@RestController
@CrossOrigin(origins = "x", methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})

@RequestMapping("/api/lista")
public class ListController {

	
	@Autowired
	private DAO repository;
	
	
	@PostMapping("/list")
	public DTO create(@Validated @RequestBody DTO p) {
		return repository.insert(p);
	}
	
	
	@GetMapping("/")
	public List<DTO> readAll(){
		return repository.findAll();
	}
	
	@PutMapping("/list/{id}")
	public DTO update (@PathVariable String id, @Validated @RequestBody DTO p) {
		return repository.save(p);
	}
	
	@DeleteMapping("/product/{id}")
	public void  delete(@PathVariable String id) {
		repository.deleteById(id);
		
	}
}
