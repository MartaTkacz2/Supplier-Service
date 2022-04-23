package com.assignment.supplierservice.controllers;

import com.assignment.supplierservice.dao.ProductRespository;
import com.assignment.supplierservice.dao.SupplierRepository;
import com.assignment.supplierservice.dto.Product;
import com.assignment.supplierservice.dto.Supplier;
import com.assignment.supplierservice.exceptions.SupplierNotFoundException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Service
public class SupplierServiceController {

  Logger log = LoggerFactory.getLogger(SupplierServiceController.class);

  @Autowired
  SupplierRepository supplierRepository;

  @Autowired
  ProductRespository productRespository;

  @ApiOperation(value = "This endpoint is used to get the all suppliers and their products")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = " Success "),
    @ApiResponse(code = 404, message = " Not found ", response = Error.class),
    @ApiResponse(code = 500, message = " Server error", response = Error.class)
  })
  @GetMapping("/suppliers")
  public Iterable<Supplier> getSuppliers(){
    log.info("Retrieving all suppliers");
    return supplierRepository.findAll();
  }

  @ApiOperation(value = "This endpoint is used to get specific supplier by {id} and their products")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = " Success "),
    @ApiResponse(code = 404, message = " Not found ", response = Error.class),
    @ApiResponse(code = 500, message = " Server error", response = Error.class)
  })
  @GetMapping("/suppliers/{id}")
  public ResponseEntity<Supplier> getSupplier(@PathVariable("id") Long id) throws SupplierNotFoundException{
    Optional<Supplier> supplier = supplierRepository.findById(id);
    if(supplier.isPresent()) {
      log.info(String.format("Retrieving supplier  %s", id));
      return ResponseEntity.ok().body(supplier.get());
    }
    else
    {
      log.error(String.format("No Supplier %s found.", id));
      throw new SupplierNotFoundException("No supplier was found : "+id);
    }
  }

  @ApiOperation(value = "This endpoint is used to create a new supplier and their products")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = " Success "),
    @ApiResponse(code = 404, message = " Not found ", response = Error.class),
    @ApiResponse(code = 500, message = " Server error", response = Error.class)
  })
  @PostMapping("/suppliers")
  public Supplier createSupplier(@RequestBody Supplier supplier){
    log.info(String.format("Creating supplier  %s", supplier));
    return supplierRepository.save(supplier);
  }

  @ApiOperation(value = "This endpoint is used to delete a supplier")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = " Success "),
    @ApiResponse(code = 404, message = " Not found ", response = Error.class),
    @ApiResponse(code = 500, message = " Server error", response = Error.class)
  })
  @DeleteMapping("/suppliers/{id}")
  public void deleteSupplier(@PathVariable(value="id") Long id){
    Optional<Supplier> supplier = supplierRepository.findById(id);
    if(supplier.isPresent()) {
      log.info(String.format("Deleting supplier  %s", id));
      supplierRepository.deleteById(id);
    }
    else
    {
      log.error(String.format("Error deleting supplier  %s", id));
      throw new SupplierNotFoundException("No supplier was found : "+id);
    }

  }

  @ApiOperation(value = "This endpoint is used to update and existing supplier and their products")
  @PutMapping("/suppliers/{id}")
  public ResponseEntity updateSupplier(@PathVariable(value="id") Long id, @RequestBody Supplier supplier){
    Optional<Supplier> saveSupplier = supplierRepository.findById(id);
    if (saveSupplier.isPresent()){
      log.info(String.format("Updating supplier  %s", id));
      return ResponseEntity.ok(supplierRepository.save(supplier));
    }
    else
    {
      log.error(String.format("Error updating supplier  %s", id));
      throw new SupplierNotFoundException("No supplier : "+id);
    }
  }

  @ApiOperation(value = "This endpoint is used to get the all products and their suppliers")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = " Success "),
    @ApiResponse(code = 404, message = " Not found ", response = Error.class),
    @ApiResponse(code = 500, message = " Server error", response = Error.class)
  })
  @GetMapping("/products")
  public Iterable<Product> getProducts(){
    log.info("Retrieving all products");
    return productRespository.findAll();
  }
}
