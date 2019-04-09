package test_02_jihe_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import domain_common.Student;

public class ListDemo {

	public static void main(String[] args) {
		/*
		 * 使用List解决插入元素问题
		 * List接口的特有方法，全都是围绕索引来定义的
		 * list获取元素的方式有两种：一种是迭代，一种是遍历+get()
		 * LIst 集合支持对元素的增删改查
		 */
		List list=new ArrayList();
		//1.添加元素
		list.add(new Student("zhangsan",23));
		list.add(new Student("lisi",34));
		//2.插入元素
		list.add(1, new Student("wanger",45));
		//3.删除元素
		list.remove(1);
		//4.得到某个元素
		Object obj=list.get(0);
		System.out.println(obj);
		//5.修改元素
		list.set(0,  new Student("wangsan",25) );
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			Student stu=(Student)object;
			System.out.println(stu.getName());
		}

	}

}
