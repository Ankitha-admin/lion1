package com.test;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestEmployee2 {
	@Test
	@Tag("dev")//used to filter test envirnoments.
	public void multipleTimes1() {
		System.out.println("Hey");
	}
	@Test
	@Tag("prod")
	public void multipleTimes2() {
		System.out.println("Hello");
	}
}
