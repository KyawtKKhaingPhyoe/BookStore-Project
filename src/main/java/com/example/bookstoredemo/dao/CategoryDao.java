package com.example.bookstoredemo.dao;

import com.example.bookstoredemo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
