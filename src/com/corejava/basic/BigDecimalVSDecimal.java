package com.corejava.basic;

import java.math.BigDecimal;

public class BigDecimalVSDecimal {
	private double a = 4.43;
	private double b = 0.2;

	public  double getDiff() {
		return a-b;
	}
	
	private BigDecimal c =BigDecimal.valueOf(a);
	private BigDecimal d = BigDecimal.valueOf(b);

	public  BigDecimal getDiffNew() {
		return c.subtract(d);
	}

	public static void main(String[] args) {
		System.out.println("Difference is :" +new BigDecimalVSDecimal().getDiff());
		System.out.println("Difference is :" +new BigDecimalVSDecimal().getDiffNew());

	}

}
