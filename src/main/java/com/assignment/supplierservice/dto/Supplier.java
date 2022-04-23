package com.assignment.supplierservice.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "supplier")
public class Supplier {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id")
  @NotNull
  @ApiModelProperty(value = "Supplier ID", required = true)
  private long id;

  @NotNull
  @Size(min = 2, max = 50)
  @ApiModelProperty(value = "Supplier Name", required = true)
  private String name;

  @Size(max = 50)
  @ApiModelProperty(value = "Supplier Address", required = false)
  private String address;

  @Column(name = "product_group")
  @ApiModelProperty(value = "Supplier Product Group", required = false)
  private int productGroup;

  @ManyToMany
  @JoinTable(name = "SUPPLIER_PRODUCT",
    joinColumns = @JoinColumn(name = "product_group"),
    inverseJoinColumns = @JoinColumn(name = "supplier_group"))
  private List<Product> product;

  public Supplier(){

  }

  public Supplier(Long id, String name, String address, Integer productGroup){
    this.id = id;
    this.name = name;
    this.address = address;
    this.productGroup = productGroup;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public long getProductGroup() {
    return productGroup;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setProductGroup(int productGroup) {
    this.productGroup = productGroup;
  }

  public List<Product> getProduct() {
    return product;
  }

  public void setProduct(List<Product> product) {
    this.product = product;
  }

  @Override
  public String toString() {
    return "Supplier{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", address='" + address + '\'' +
      ", productGroup=" + productGroup +
      '}';
  }
}
