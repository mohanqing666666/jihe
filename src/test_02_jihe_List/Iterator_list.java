package test_02_jihe_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_list {
	/**
	 * 
	 * <p>Title: main</p>  
	 * <p>Description:list���ϵ��� </p>  
	 * @author shenlan  
	 * @date 2019��4��4��  
	 * @param args
	 */
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		/**
		 * //��ȡ�����е�Ԫ��,��������е�Ԫ����test2�����������м���java
		 * 
		 *������java.util.ConcurrentModificationException
		 *�ڵ��������У�ʹ�ü��ϵķ�����Ԫ�ؽ��в��������µ���������֪�������еı仯�������������ݵĲ�ȷ����
		 *������ڵ���ʱ����Ҫʹ�ü��Ϸ�������Ԫ�ء�
		 *��ô��Ҫ�ڵ���ʱ��Ԫ�ز���զ�죿����ʹ�õ������ķ���������
		 *���Ǻ��ź����������ķ�ʽֻ��hasNext(),next(),remove();
		 *Iterator��һ���ӽӿڿ�����ɸ�����Ľ������λ�ȡ���ӽӿڶ����أ�
		 *ͨ��List�ӿ��е�listiterator()�Ϳ��Ի�ȡ
		 *��ס�����б������ֻ��List�ӿ���,���������������������ڵ�����������ɾ�Ĳ鶯����
		 */
		
		
//		Iterator it=list.iterator();
//		��ȡ�б����������
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
