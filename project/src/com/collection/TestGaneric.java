package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGaneric {
	
	/*
	 * 带有泛型的__Course的List类型属性
	 */
	public List<Course> course = new ArrayList<Course>();
//	
//	public void testGaneric(){
//		this.course = new ArrayList<Course>();
//	}
	
	/*
	 * 测试增加
	 */
	public void testAdd(){
		Course cr1 = new Course("1", "大学语文");
		course.add(cr1);
		//泛型集合中，不能添加泛型规定的类型以外及其子类型的对象，否则会报错
		Course cr2 = new Course("2", "Java基础");
		course.add(cr2);
	}
	
	/*
	 * 测试循环遍历
	 */
	public void testForEach(){
		for(Course cr: course){
			System.out.println("course：" + cr.id + ":" + cr.name);
		}
	}
	
	/*
	 * 泛型结合可以添加泛型的子类型的对象
	 */
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "我是子类型的课程对象实例~~";
		course.add(ccr);
	}
	
	/*
	 * 泛型不能使用基本类型
	 */
	public void testBasicType(){
//		List<int> list = new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("基本类型必须使用包装类型作为泛型:" + list.get(0));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGaneric Test = new TestGaneric();
//		Test.testGaneric();
		Test.testAdd();
		Test.testChild();
		Test.testForEach();
		Test.testBasicType();
	}

}
