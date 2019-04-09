package test_01_jihe_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratorObject {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @author shenlan  
	 * @date 2019年4月4日  
	 * @param args
	 */

	public static void main(String[] args) {
       
          Collection coll=new ArrayList();
          
          /*细节
           * 1.集合中存储的是对象的引用
           * 2.集合中可以存储基本数值类型吗？ 不行。但是JDK1.5以后，可以这么写，因为自带拆装箱
           * 3.存储时提升了Object，取出时要使用元素的特有内容，必须向下转型
           * */
          //存储元素
          coll.add("djkfj");//存储的是对象引用
          
          coll.add(1); // coll.add(Integer.valueOf(1));//自动装箱
          
          coll.add("obj");//Object obj="obj";提升为object
          coll.add("df");
          coll.add("hy");
          coll.add("we");
          
          for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			String obj=(String)object;
			System.out.println(obj.length());
		}
          
	}

}
