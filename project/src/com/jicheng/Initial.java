package com.jicheng;

public class Initial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.age = 100;
		dog.eat();
		dog.method();
		Dog dog2 = new Dog();
		if(dog.equals(dog2)){
			System.out.println("两个对象是相同的");
		}else{
			System.out.println("两个对象是不相同的");
		}
	}

}
