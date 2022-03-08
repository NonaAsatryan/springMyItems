package com.example.springMyItems.repository;

import com.example.springMyItems.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
