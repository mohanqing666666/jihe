package test_01_jihe_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import domain_common.Student;

public class jiheTest01 {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description:往集合中存储自定义对象 </p>  
	 * @author shenlan  
	 * @date 2019年4月4日  
	 * @param args
	 */
	public static void main(String[] args) {
		//1.创建集合对象
		Collection coll=new ArrayList ();
		//2.添加具体的学生元素
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
