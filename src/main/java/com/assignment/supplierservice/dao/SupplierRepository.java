package com.assignment.supplierservice.dao;

import com.assignment.supplierservice.dto.Supplier;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long>{
}
