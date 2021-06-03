package com.residencia.dvdrental.controllers;

import java.util.List;

import com.residencia.dvdrental.entities.Category;
import com.residencia.dvdrental.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(categoryService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(categoryService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public Long count() {
		return categoryService.count();
	}

	@PostMapping
	public ResponseEntity<Category> save(@RequestBody Category category){
		HttpHeaders headers = new HttpHeaders();
		Category newCategory = categoryService.save(category);
		if(null != newCategory)
			return new ResponseEntity<>(newCategory, headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(newCategory, headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Category update(@RequestBody Category category, @PathVariable Integer id){
       return categoryService.update(category,id);
    }

	@DeleteMapping
	public void delete(@RequestParam Integer id){
		categoryService.deleteById(id);
	}
}
