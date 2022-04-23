package com.assignment.supplierservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.any())
      .paths(PathSelectors.any())
      .build()
      .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo() {
    return new ApiInfo(
      "Supplier-service",
      "Microservices Architecture Assignment 2022 – Weighting 40%. Supplier-service application to retrieve details about suppliers and products that each supplier carries",
      "V1",
      "Terms of service",
      new Contact("A00204653@student.ait.ie", "localhost:8081/swagger-ui/index.html", "A00204653@student.ait.ie"),
      "License of API", "API license URL", Collections.emptyList());
  }

}
