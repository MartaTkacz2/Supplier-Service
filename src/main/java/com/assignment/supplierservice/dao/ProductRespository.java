package com.assignment.supplierservice.dao;

import com.assignment.supplierservice.dto.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends CrudRepository<Product, Long> {
}
