package com.ag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

	private final DiscountCalculator calculator = new DiscountCalculator();

	@Test
	void testNoDiscount() {
		assertEquals(100.0, calculator.calculateDiscountedPrice(100.0, false, 1, 10));
	}

	@Test
	void testMemberDiscount() {
		assertEquals(90.0, calculator.calculateDiscountedPrice(100.0, true, 1, 10));
	}

	@Test
	void testLoyaltyDiscount() {
		assertEquals(85.0, calculator.calculateDiscountedPrice(100.0, true, 6, 10));
	}

	@Test
	void testSeniorDiscount() {
		assertEquals(85.0, calculator.calculateDiscountedPrice(100.0, true, 1, 70));
	}

	// ----

	@Test
	void testLoyaltyDiscountWith5YearsOfMembership() {
		assertEquals(90.0, calculator.calculateDiscountedPrice(100.0, true, 5, 10));
	}

	@Test
	void testSeniorDiscountwithAge65() {
		assertEquals(90.0, calculator.calculateDiscountedPrice(100.0, true, 1, 65));
	}
}
