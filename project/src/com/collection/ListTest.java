package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * 备选课程
 */
public class ListTest {
	/*
	 * 用于存放备选课程的List
	 * 本类List的增删改查
	 */
	public List courseToSelect;
	
	public ListTest(){
		
		this.courseToSelect = new ArrayList();
		
	}
	
	/*
	 * 用于往courseToSelect里添加课程
	 */
	public void testAdd(){
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1", "数据结构");
		courseToSelect.add(cr1);
		Course temp = (Course) courseToSelect.get(0);
		System.out.println("添加了课程：" + temp.id + ":" + temp.name);
		
		Course cr2 = new Course("2", "C语言");
		courseToSelect.add(0, cr2);
		Course temp2 = (Course) courseToSelect.get(0);
		System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);
		
		//使用数组的方式以List方式添加到List
		Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		courseToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) courseToSelect.get(2);
		Course temp4 = (Course) courseToSelect.get(3);
		System.out.println("添加了课程：" + temp3.id + ":" + temp3.name);
		System.out.println("添加了课程：" + temp4.id + ":" + temp4.name);
		
		Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
		courseToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) courseToSelect.get(2);
		Course temp6 = (Course) courseToSelect.get(3);
		System.out.println("添加了课程：" + temp5.id + ":" + temp5.name);
		System.out.println("添加了课程：" + temp6.id + ":" + temp6.name);
		
	}
	
	/*
	 * 取得List中元素的方法
	 */
	public void testGet(){
		int size = courseToSelect.size();
		System.out.println("有如下课程待选：");
		for(int i = 0; i < size; i++){
			Course cr = (Course) courseToSelect.get(i);
			System.out.println("course：" + cr.id + "：" + cr.name);
		}
	}
	
	/*
	 * 通过迭代器来遍历List
	 */
	public void testIterator(){
		//通过集合的Iterator方法，取得迭代器的实例
		Iterator it = courseToSelect.iterator();
		System.out.println("有如下课程待选(通过迭代器Iterator返回)：");
		while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("course：" + cr.id + "：" + cr.name);
		}
	}
	
	/*
	 * 通过for each方法访问集合的元素
	 */
	public void testForEach(){
		System.out.println("有如下课程待选(通过for each返回)：");
		for(Object obj: courseToSelect){
			Course cr = (Course) obj;
			System.out.println("course：" + cr.id + "：" + cr.name);
		}
	}
	
	/*
	 * 修改List中的元素
	 */
	public void testModify(){
		courseToSelect.set(2, new Course("2", "毛概"));
		courseToSelect.set(0, new Course("0", "C语言"));
		testForEach();
	}
	
	/*
	 * 删除List中的元素
	 */
	public void testRemove(){
//		Course cr = (Course) courseToSelect.get(4);
//		System.out.println("我是课程：" + cr.id + "：" + cr.name + "，我即将被删除");
//		1 System.out.println("即将删除4");
		System.out.println("即将删除1位置和2位置上的课程");
		Course[] course = {(Course) courseToSelect.get(1),(Course) courseToSelect.get(2)};
//		courseToSelect.remove(cr);
//		1 courseToSelect.remove(4);
		courseToSelect.removeAll(Arrays.asList(course));
		testForEach();
	}
	
	/*
	 * 往List中添加一些奇怪的东西
	 */
	public void testType(){
		System.out.println("往List中添加了奇怪的东西");
		courseToSelect.add("我不是课程");
		testForEach();
	}
	
	public static void main(String[] args){
		ListTest Lt = new ListTest();
		Lt.testAdd();
		Lt.testGet();
		Lt.testIterator();
		Lt.testForEach();
		System.out.println("开始修改");
		Lt.testModify();
		System.out.println("修改结束且打印");
		System.out.println("开始删除==========");
		Lt.testRemove();
		System.out.println("删除结束且打印");
		//Lt.testType();
	}
	
}
