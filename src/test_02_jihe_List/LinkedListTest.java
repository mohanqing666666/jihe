package test_02_jihe_List;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		/**
		 * �����⣺��LinkListģ��һ����ջ�Ͷ��е����ݽṹ��
		 * ����һ����ջ�Ͷ��е����ݽṹ���󣬸ö���ʹ�õ���linkedList����ɵġ�
		 */
		Query query=new Query();
		query.myadd("1");
		query.myadd("2");
		query.myadd("3");
		query.myadd("4");
		while(!query.isNull()){
			System.out.println(query.myGet());
		}
		
	}
	


}
/**
 * ����һ���������ݽṹ��Queue
 */
class Query{
	//��װһ���������ݽṹ
	private LinkedList link;
	/**
	 * ���г�ʼ��ʱ���������ʼ��
	 */
	Query(){
		link=new LinkedList();
	}
	/**
	 * �������Ԫ�صĹ���
	 */
	public void  myadd(Object object) {
		//�ڲ�����ʹ�õ�����ķ���
		link.addFirst(object);	
	}
	/**
	 * ���еĻ�ȡ����
	 */
	public Object myGet() {
		return link.removeLast();
	}
	/**
	 * �ж϶����Ƿ�Ϊ�գ�û��Ԫ�ؾ�Ϊ��
	 */
	public Boolean isNull(){
		return link.isEmpty();
		
	}
	
	
}