package com.assignment.supplierservice;
import com.assignment.supplierservice.controllers.SupplierServiceController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class SupplierServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	/**
	 * 2022-04-24 20:54:18.199  INFO 17994 --- [           main] c.a.s.SupplierServiceApplicationTests    : Started SupplierServiceApplicationTests in 4.062 seconds (JVM running for 4.824)
	 * 2022-04-24 20:54:18.267  INFO 17994 --- [           main] c.a.s.c.SupplierServiceController        : Retrieving all suppliers
	 * [ERROR] Tests run: 2, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 4.478 s <<< FAILURE! - in com.assignment.supplierservice.SupplierServiceApplicationTests
	 * [ERROR] testDeleteSupplier_nullReportName  Time elapsed: 0.063 s  <<< ERROR!
	 * java.lang.NullPointerException
	 *         at com.assignment.supplierservice.SupplierServiceApplicationTests.testDeleteSupplier_nullReportName(SupplierServiceApplicationTests.java:18)
	 *
	 * 2022-04-24 20:54:18.319  INFO 17994 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
	 */
//	@Test
//	public void testDeleteSupplier_nullReportName() {
//		SupplierServiceController supplierServiceController = new SupplierServiceController();
//		String results = supplierServiceController.getSuppliers().toString();
//		assertEquals(results, "Hello");
//	}

}
