package test_01_jihe_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class getCollection {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description:��ȡ�����е�Ԫ�� </p>  
	 * @author shenlan  
	 * @date 2019��4��4��  
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ���ϵ�ȡ����ʽ
		 */
		//��������
		Collection coll=new ArrayList();
		coll.add("1");
		coll.add("2");
		coll.add("3");
		coll.add("4");
		coll.add("5");
		//2.��ȡ�����ĵ���������ͨ��iterator����
		Iterator it = coll.iterator();
		//3.ʹ�þ���ĵ����������ȡ�����е�Ԫ�ء����ĵ������ķ���
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		//System.out.println(it.next());//java.util.NoSuchElementException
		/*һ��ȡֵ*/
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*����ʹ��*/
		for(Iterator It=coll.iterator();It.hasNext();){
			System.out.println(It.next());
		}
	}
	

}
