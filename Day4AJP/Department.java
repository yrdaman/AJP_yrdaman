package Day4AJP;

public class Department extends Employee {
    public static void main(String[] args) {
        Employee emp =new Employee();
        emp.age=21;
        emp.name="YRDAMAN";
        emp.emailId="yrdaman196@gmail.com";
        emp.designation="DEV";
        emp.contactNumber="123456789";
        emp.setsalary(20000);
        Department dept = new Department();
        dept.setsalary(20000);
        System.out.println("Employee Details:\n"+emp.name+"\n"+emp.age+"\n"+emp.emailId+"\n"+emp.contactNumber+"\n"+ emp.designation+"\n"+emp.getsalary());

    }
    
}
