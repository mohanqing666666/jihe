package test_02_jihe_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import domain_common.Student;

public class ListDemo {

	public static void main(String[] args) {
		/*
		 * ʹ��List�������Ԫ������
		 * List�ӿڵ����з�����ȫ����Χ�������������
		 * list��ȡԪ�صķ�ʽ�����֣�һ���ǵ�����һ���Ǳ���+get()
		 * LIst ����֧�ֶ�Ԫ�ص���ɾ�Ĳ�
		 */
		List list=new ArrayList();
		//1.���Ԫ��
		list.add(new Student("zhangsan",23));
		list.add(new Student("lisi",34));
		//2.����Ԫ��
		list.add(1, new Student("wanger",45));
		//3.ɾ��Ԫ��
		list.remove(1);
		//4.�õ�ĳ��Ԫ��
		Object obj=list.get(0);
		System.out.println(obj);
		//5.�޸�Ԫ��
		list.set(0,  new Student("wangsan",25) );
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			Student stu=(Student)object;
			System.out.println(stu.getName());
		}

	}

}
