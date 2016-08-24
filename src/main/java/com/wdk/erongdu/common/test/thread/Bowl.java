package com.wdk.erongdu.common.test.thread;

class Bowl {
	public Bowl(int marker) {
		System.out.println("Bowl"+marker);
	}
	void f1(int marker){
		System.out.println("f1"+marker);
	}
}

class Table{
	static Bowl bowl1 = new Bowl(1);
	Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	
	void f2(int marker){
		System.out.println("f2"+marker);
	}
	
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard{
	//调用 Cupboard的构造函数前  先初始化类变量.初始化顺序  先初始化 静态变量,再初始化成员变量.
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	
	void f3(int marker){
		System.out.println("f3"+marker);
	}
	
	static Bowl bowl5 = new Bowl(5);
}
