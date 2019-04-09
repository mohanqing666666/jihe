package domain_common;

public class Student {
  
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	/**
	 * ����ѧ�������ж���ȵ����ݡ�����equals������ֻҪͬ����ͬ�������ͬһ���ˣ���Ϊͬһ��Ԫ��
	 */
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(!(obj instanceof Student)){
			throw new ClassCastException("���ʹ���");
		}
	    Student stu=(Student)obj;
	    return this.name.equals(stu.name)&& this.age==stu.age;
	}
	
	


}
