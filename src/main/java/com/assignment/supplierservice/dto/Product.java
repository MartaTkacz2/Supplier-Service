package com.assignment.supplierservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @NotNull
  @ApiModelProperty(value = "Product ID", required = true)
  private long id;

  @NotNull
  @Size(min = 2, max = 50)
  @ApiModelProperty(value = "Product Name", required = true)
  private String name;

  @NotNull
  @ApiModelProperty(value = "Product Price", required = true)
  private double price;
  
  @NotNull
  @Column(name = "supplier_group")
  @ApiModelProperty(value = "The supplier ID to which this product belongs", required = true)
  private long supplierGroup;

  @ManyToMany(mappedBy = "product")
  @JsonIgnore
  private List<Supplier> supplier;

  public Product(){}

  public Product(long id, String name, double price, long group) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.supplierGroup = group;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public long getSupplierGroup() {
    return supplierGroup;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setSupplierGroup(long group) {
    this.supplierGroup = group;
  }

  public List<Supplier> getSupplier() {
    return supplier;
  }

  public void setSupplier(List<Supplier> supplier) {
    this.supplier = supplier;
  }
  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", price=" + price +
      ", supplierGroup=" + supplierGroup +
      '}';
  }
}
