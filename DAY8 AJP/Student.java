package DAY8_AJP;

public class Student {
	int sid;
	String name;
	/*if the default construct is private the it can't be access by the other class */
	 Student(){
		System.out.println("Student Object created");
	}
	private Student(int  id , String n){
		
		System.out.println(id+" "+n);
	}

	public static void main(String[] args) {
		Student stu =new Student();
		Student stu1 =new Student(1,"YRDAMAN");
		Student stu2=new Student(2,"SHAKEER");
		Student stu3=new Student(3,"SHASI");

	}

}

