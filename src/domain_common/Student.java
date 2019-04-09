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
	 * 建立学生对象判断相等的依据。覆盖equals方法，只要同姓名同年龄就是同一个人，视为同一个元素
	 */
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(!(obj instanceof Student)){
			throw new ClassCastException("类型错误");
		}
	    Student stu=(Student)obj;
	    return this.name.equals(stu.name)&& this.age==stu.age;
	}
	
	


}
