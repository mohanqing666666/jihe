package test_02_jihe_List;

import java.util.LinkedList;

public class LinkedListDemo {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @author shenlan  
	 * @date 2019年4月8日  
	 * @param args
	 */

	public static void main(String[] args) {
	  /**
	   * 学习内容：
	   * addFirst();
	   * addLast();
	   * 
	   * getFirst();//获取头部元素
	   * getLast();//获取尾部元素
	   * 
	   * removeFirst();获取头部元素，并删除头部元素
	   * removeLast();获取尾部元素，并删除尾部元素。
	   * 
	   */
		LinkedList list=new LinkedList();
		list.addFirst("1");
		list.addFirst("2");
		list.addFirst("3");
//		System.out.println(list);
//		
//		System.out.println(list.getFirst());
//		System.out.println(list.getFirst());
//
//		System.out.println(list.removeFirst());
//		System.out.println(list.removeFirst());
		
		while(!list.isEmpty()){
//			System.out.println(list.removeFirst());//实现堆栈
			
			System.out.println(list.removeLast());//实现队列
		}
	}

}
