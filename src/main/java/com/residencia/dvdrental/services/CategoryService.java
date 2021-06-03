package com.residencia.dvdrental.services;

import java.util.List;

import com.residencia.dvdrental.entities.Category;
import com.residencia.dvdrental.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {
    
    @Autowired
    public CategoryRepository categoryRepository;

    public Category findById(Integer id){
        return categoryRepository.findById(id).get();
    }

    public List<Category> findAll(){ //Integer pages, Integer qtdRegistros
        return categoryRepository.findAll();
    }

    public Long count() {
        return categoryRepository.count();
    }

    public Category save(Category category) {
        Category newCategory = categoryRepository.save(category);
            return newCategory;
    }

    public Category update(Category category, Integer id){
        category.setCategory_id(id);
        return categoryRepository.save(category);
    }

    public void deleteById(Integer id) {  
        categoryRepository.deleteById(id); 
    }
}
