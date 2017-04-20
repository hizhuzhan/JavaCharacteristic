package com.jicheng;

public class Dog extends Animal {
	public int age = 20;
	public void eat(){
		System.out.println("年龄：" +
				age + " 狗具有吃骨头的能力");
	}
	public Dog(){
		System.out.println("Dog");
	}
	public void method(){
		System.out.println(super.age);
		super.eat();
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
