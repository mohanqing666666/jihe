package test_01_jihe_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import domain_common.Student;

public class jiheTest01 {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description:�������д洢�Զ������ </p>  
	 * @author shenlan  
	 * @date 2019��4��4��  
	 * @param args
	 */
	public static void main(String[] args) {
		//1.�������϶���
		Collection coll=new ArrayList ();
		//2.��Ӿ����ѧ��Ԫ��
		Student stu=new Student("lisi",23);
		coll.add(stu);
		coll.add(new Student("wanger",45));
		coll.add(new Student("zhangsan",25));
	
		
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			Student stu1 = (Student) iterator.next();
			System.out.println(stu1.getName());
		}
		
		
	}

}
