package test_02_jihe_List;

import java.util.LinkedList;

public class LinkedListDemo {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @author shenlan  
	 * @date 2019��4��8��  
	 * @param args
	 */

	public static void main(String[] args) {
	  /**
	   * ѧϰ���ݣ�
	   * addFirst();
	   * addLast();
	   * 
	   * getFirst();//��ȡͷ��Ԫ��
	   * getLast();//��ȡβ��Ԫ��
	   * 
	   * removeFirst();��ȡͷ��Ԫ�أ���ɾ��ͷ��Ԫ��
	   * removeLast();��ȡβ��Ԫ�أ���ɾ��β��Ԫ�ء�
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
//			System.out.println(list.removeFirst());//ʵ�ֶ�ջ
			
			System.out.println(list.removeLast());//ʵ�ֶ���
		}
	}

}
