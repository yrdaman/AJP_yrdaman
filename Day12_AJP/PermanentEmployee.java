package Day12_AJP;


public class PermanentEmployee extends Employee {
	int tA,dA;
	void calc_sal() {
		super.calc_sal();
		int totalSalary =basic_pay+pf+tA+dA;
		System.out.println("Permanent Emp Total Salary = "+totalSalary);
	}
	void get() {
		System.out.println("Permanent Employee Class");
	}
	

}
