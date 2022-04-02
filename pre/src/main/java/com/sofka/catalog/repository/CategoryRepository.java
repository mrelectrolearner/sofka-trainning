package com.sofka.catalog.repository;

import com.sofka.catalog.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}