package test_02_jihe_List;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		/**
		 * 面试题：用LinkList模拟一个堆栈和队列的数据结构。
		 * 创建一个堆栈和队列的数据结构对象，该对象使用的是linkedList来完成的。
		 */
		Query query=new Query();
		query.myadd("1");
		query.myadd("2");
		query.myadd("3");
		query.myadd("4");
		while(!query.isNull()){
			System.out.println(query.myGet());
		}
		
	}
	


}
/**
 * 定义一个队列数据结构。Queue
 */
class Query{
	//封装一个链表数据结构
	private LinkedList link;
	/**
	 * 队列初始化时，对链表初始化
	 */
	Query(){
		link=new LinkedList();
	}
	/**
	 * 队列添加元素的功能
	 */
	public void  myadd(Object object) {
		//内部就是使用的链表的方法
		link.addFirst(object);	
	}
	/**
	 * 队列的获取方法
	 */
	public Object myGet() {
		return link.removeLast();
	}
	/**
	 * 判断队列是否为空，没有元素就为空
	 */
	public Boolean isNull(){
		return link.isEmpty();
		
	}
	
	
}