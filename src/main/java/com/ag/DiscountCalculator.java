package com.ag;

public class DiscountCalculator {
	public double calculateDiscountedPrice(double originalPrice, boolean isMember, int yearsOfMembership, int age) {
		double discount = 0;
		if (isMember) {
			discount += 0.1; // 10% member discount
			if (yearsOfMembership > 5){
				discount += 0.05; // 5% loyalty discount
			}

			if(age > 65){
				discount += 0.05; // 5% senior discount
			}
		}
		return originalPrice * (1 - discount);
	}
}
