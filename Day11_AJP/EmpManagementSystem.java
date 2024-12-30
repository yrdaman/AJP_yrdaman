package Day11_AJP;

public class EmpManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PermanentEmployee pemp =new PermanentEmployee();
	pemp.basic_pay=40000;
	pemp.pf=5000;
	pemp.dA=3000;
	pemp.tA=3000;
	
	pemp.calc_sal();
	
	Employee emp =new Employee();
	emp.basic_pay=30000;
	emp.pf=3000;
	int a=60;//4bytes
	long b=a;//8bytes
	emp.calc_sal();
	
	
	Employee emp1 =new PermanentEmployee();
	emp1.basic_pay=20000;
	emp1.pf=3000;
	emp1.calc_sal();
	//emp1.get
	}

}