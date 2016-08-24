package com.wdk.erongdu.common.test.thread;

public class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard(); // 静态变量只初始化一次,共用一块儿内存. 再次new的时候  只初始化成员变量.静态变量没有再次初始化.
		System.out.println("Creating new Cupboard() in main");
		new Cupboard(); // 静态变量只初始化一次,共用一块儿内存. 再次new的时候  只初始化成员变量.静态变量没有再次初始化.
		table.f2(1);
		cupboard.f3(1);
	}
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}

// bowl1
// bowl2
//Table()
//f11