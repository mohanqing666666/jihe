package test_01_jihe_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class jihe {

	public static void main(String[] args) {
		Collection coll=new ArrayList();//目前演示Collection的方法，不关心子类对象的类型是什么
		conllectionDemo(coll);
		
		Collection coll1=new ArrayList();
		Collection coll2=new ArrayList();
		Collection coll3=new ArrayList();
		conllectionDemo2(coll1,coll2,coll3);

	}
	/**
	 * 
	 * <p>Title: conllectionDemo2</p>  
	 * <p>Description: 带all的特殊用法</p>  
	 * @author shenlan  
	 * @date 2019年4月4日  
	 * @param coll1
	 * @param coll2
	 * @param coll3 
	 */
private static void conllectionDemo2(Collection coll1, Collection coll2, Collection coll3) {
		coll1.add("1");
		coll1.add("2");
		coll1.add("3");
		coll1.add("4");
		
		coll2.add("1");
		coll2.add("5");
		coll2.add("6");
		
		coll3.add("1");
		coll3.add("9");
		coll3.add("6");
		//包含关系
		System.out.println("containsAll-"+coll1.containsAll(coll2));;
		//删除coll1中与coll2中相同的元素
		coll1.removeAll(coll2);
		System.out.println(coll1);
		//保留coll1中与coll3相同的元素
		coll3.retainAll(coll2);
		System.out.println("retainAll"+coll3);
		//添加
		coll1.addAll(coll2);
		System.out.println(coll1);

		
		
		
	}
/**
 * 
 * <p>Title: conllectionDemo</p>  
 * <p>Description: </p>  
 * @author shenlan  
 * @date 2019年4月4日  
 * @param coll
 */
	private static void conllectionDemo(Collection coll) {
		/*collection 常用方法*/
		//1.往集合中添加对象元素。add(object)
		coll.add("qwe");
		coll.add("dhfkj");
		coll.add("dsf");
		coll.add("dsf");
		System.out.println(coll);//将元素数组打印[qwe, dhfkj, dsf, dsf]
		//删除元素
		coll.remove("qwe");
		System.out.println(coll);
		//集合包含关系
		System.out.println(coll.contains("dsff"));
		//判断集合是否为空
		System.out.println(coll.isEmpty());
		//集合元素数
		System.out.println(coll.size());
		//集合清楚
		coll.clear();
		System.out.println(coll);
		
		/*注：collection 没有插入功能*/
		
	}

}
