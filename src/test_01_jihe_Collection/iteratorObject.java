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
	 * @date 2019��4��4��  
	 * @param args
	 */

	public static void main(String[] args) {
       
          Collection coll=new ArrayList();
          
          /*ϸ��
           * 1.�����д洢���Ƕ��������
           * 2.�����п��Դ洢������ֵ������ ���С�����JDK1.5�Ժ󣬿�����ôд����Ϊ�Դ���װ��
           * 3.�洢ʱ������Object��ȡ��ʱҪʹ��Ԫ�ص��������ݣ���������ת��
           * */
          //�洢Ԫ��
          coll.add("djkfj");//�洢���Ƕ�������
          
          coll.add(1); // coll.add(Integer.valueOf(1));//�Զ�װ��
          
          coll.add("obj");//Object obj="obj";����Ϊobject
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
