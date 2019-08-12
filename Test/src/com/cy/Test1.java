package com.cy;

public class Test1 {
	public static void main(String[] args) {
		//真实角色.
		Animal dog=new Dog();
		//代理角色.
		ProxyRole proxyRole=new ProxyRole(dog);
		//代替执行.
		proxyRole.run();
	}
}

