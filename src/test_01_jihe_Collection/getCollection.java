package test_01_jihe_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class getCollection {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description:获取集合中的元素 </p>  
	 * @author shenlan  
	 * @date 2019年4月4日  
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 集合的取出方式
		 */
		//创建集合
		Collection coll=new ArrayList();
		coll.add("1");
		coll.add("2");
		coll.add("3");
		coll.add("4");
		coll.add("5");
		//2.获取容器的迭代器对象，通过iterator方法
		Iterator it = coll.iterator();
		//3.使用具体的迭代器对象获取集合中的元素。参阅迭代器的方法
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		//System.out.println(it.next());//java.util.NoSuchElementException
		/*一般取值*/
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*建议使用*/
		for(Iterator It=coll.iterator();It.hasNext();){
			System.out.println(It.next());
		}
	}
	

}
