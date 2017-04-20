package com.duotai;

public class Initial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();  //父类的引用可以指向子类
		//Dog obj3 = new Animal();	//子类的引用不可以指向父类
		Cat obj3 = new Cat();
		obj1.eat();
		obj2.eat();
	}

}
