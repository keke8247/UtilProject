package com.erongdu.test.proxy;

public class TestProxy {
	public static void main(String[] args) throws Exception {
		//获得代理类
		Calculator calculator = (Calculator) new CalculatorInvocationHandler(new CalculatorImpl()).getProxy();
		
		calculator.add(10, 11);
	}
}
