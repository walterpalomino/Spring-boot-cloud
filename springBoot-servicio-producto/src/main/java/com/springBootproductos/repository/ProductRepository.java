package com.springBootproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootproductos.entity.Category;
import com.springBootproductos.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	
	public Product findByCategory(Category category);
	public Product findByNameProducto(String name);
	
}
