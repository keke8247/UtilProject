package com.wdk.erongdu.common.test.thread;

public class Foo {
	private int x = 100;
	public int getX(){
		synchronized(this){
			return x;	
		}
	}
	
	public synchronized int fix(int y){
		x = x-y;
		return x;
	}
}
