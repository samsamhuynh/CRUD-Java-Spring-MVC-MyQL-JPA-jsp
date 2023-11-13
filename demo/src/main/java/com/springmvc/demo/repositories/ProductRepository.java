package com.springmvc.demo.repositories;

import com.springmvc.demo.models.Category;
import com.springmvc.demo.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
    Iterable<Product> findByCategoryID(String categoryID);
}
