package test_02_jihe_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import domain_common.Student;

public class LinkedListTest01 {

	public static void main(String[] args) {
          
		List list=new ArrayList();
		list.add(new Student("zhangsan", 12));
		list.add(new Student("lisi", 32));
		list.add(new Student("wanger", 13));
		list.add(new Student("wanger", 13));
		List list2=new ArrayList();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = iterator.next();
			if(!list2.contains(object)){
				list2.add(object);
			}
			System.out.println();
			
		}
		list.clear();
		list.addAll(list2);
		System.out.println(list);
         
	}

}
