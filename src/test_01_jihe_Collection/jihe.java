package test_01_jihe_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class jihe {

	public static void main(String[] args) {
		Collection coll=new ArrayList();//Ŀǰ��ʾCollection�ķ�������������������������ʲô
		conllectionDemo(coll);
		
		Collection coll1=new ArrayList();
		Collection coll2=new ArrayList();
		Collection coll3=new ArrayList();
		conllectionDemo2(coll1,coll2,coll3);

	}
	/**
	 * 
	 * <p>Title: conllectionDemo2</p>  
	 * <p>Description: ��all�������÷�</p>  
	 * @author shenlan  
	 * @date 2019��4��4��  
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
		//������ϵ
		System.out.println("containsAll-"+coll1.containsAll(coll2));;
		//ɾ��coll1����coll2����ͬ��Ԫ��
		coll1.removeAll(coll2);
		System.out.println(coll1);
		//����coll1����coll3��ͬ��Ԫ��
		coll3.retainAll(coll2);
		System.out.println("retainAll"+coll3);
		//���
		coll1.addAll(coll2);
		System.out.println(coll1);

		
		
		
	}
/**
 * 
 * <p>Title: conllectionDemo</p>  
 * <p>Description: </p>  
 * @author shenlan  
 * @date 2019��4��4��  
 * @param coll
 */
	private static void conllectionDemo(Collection coll) {
		/*collection ���÷���*/
		//1.����������Ӷ���Ԫ�ء�add(object)
		coll.add("qwe");
		coll.add("dhfkj");
		coll.add("dsf");
		coll.add("dsf");
		System.out.println(coll);//��Ԫ�������ӡ[qwe, dhfkj, dsf, dsf]
		//ɾ��Ԫ��
		coll.remove("qwe");
		System.out.println(coll);
		//���ϰ�����ϵ
		System.out.println(coll.contains("dsff"));
		//�жϼ����Ƿ�Ϊ��
		System.out.println(coll.isEmpty());
		//����Ԫ����
		System.out.println(coll.size());
		//�������
		coll.clear();
		System.out.println(coll);
		
		/*ע��collection û�в��빦��*/
		
	}

}
