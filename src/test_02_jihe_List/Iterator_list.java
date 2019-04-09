package test_02_jihe_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_list {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description:list集合迭代 </p>  
	 * @author shenlan  
	 * @date 2019年4月4日  
	 * @param args
	 */
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		/**
		 * //获取集合中的元素,如果集合中的元素有test2，就往集合中加入java
		 * 
		 *引发了java.util.ConcurrentModificationException
		 *在迭代过程中，使用集合的方法对元素进行操作，导致迭代器并不知道集合中的变化，容易引发数据的不确定性
		 *解决：在迭代时，不要使用集合方法操作元素。
		 *那么想要在迭代时对元素操作咋办？可以使用迭代器的方法操作。
		 *可是很遗憾：迭代器的方式只有hasNext(),next(),remove();
		 *Iterator有一个子接口可以完成该问题的解决。如何获取该子接口对象呢？
		 *通过List接口中的listiterator()就可以获取
		 *记住：该列表迭代器只有List接口有,而且这个迭代器可以完成在迭代过程中增删改查动作。
		 */
		
		
//		Iterator it=list.iterator();
//		获取列表迭代器对象
		ListIterator it=list.listIterator();
		while(it.hasNext()){
			Object obj=it.next();
			if("test2".equals(obj)){
//				list.add("java");
				it.add("java");
//				it.set("java");
			}
			
		}
		for(int i=0;i<list.size();i++){
			if("test2".equals(list.get(i))){
				list.set(i,"java");
			}
		}
		System.out.println(list);
	}

}
