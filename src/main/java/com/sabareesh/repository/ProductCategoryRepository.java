package com.sabareesh.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sabareesh.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
