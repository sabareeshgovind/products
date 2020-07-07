package com.sabareesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabareesh.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
