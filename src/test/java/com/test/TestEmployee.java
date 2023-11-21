package com.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
// We can define multiple test methods inside testcase//we can specify our own
// order using testmethodorder
//alphanumeric order-for test method order
//First sort 0-9 and  then compare A-Z 
public class TestEmployee {
	@BeforeAll
	public static void beforeall() {
		System.out.println("Before class only once ");
	}

	@BeforeEach
	public void setup() {
		// initdata
		// this method at before every testcase.
		System.out.println("Before setup at each testcase");
	}

	@RepeatedTest(value = 3, name = "{displayName}-{currentRepetition}/{totalRepetitions}")
	@DisplayName("MULTIPLE")
	public void multipleTimes(TestInfo info) {
		System.out.println(" repition of Multiple Test:" + info.getDisplayName());
	}

	@Test
	@Order(1)
	@DisplayName("Testing save")
	// it provides readable text in place of actual method name in junit console.
	protected void testSave() {
		System.out.println("Hello-Save");

	}

	@Test
	@Order(2)
	@DisplayName("Testing Update")
	// it provides readable text in place of actual method name in junit console.
	@Disabled
	// This annotation ignore one testmethod while excecuting test case.
	public void testUpdate() {
		System.out.println("Hello-Update");

	}

	@AfterEach
	public void clear() {
		System.out.println("after each  testcase");
	}

	@AfterAll
	public static void afterall() {
		System.out.println("Afterclass only once");
	}
}
