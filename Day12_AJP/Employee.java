package Day12_AJP;
public class Employee {
	int basic_pay;
	int pf;
	void calc_sal() {
		int totalSalary =basic_pay+pf;
		System.out.println("Permanent Emp updated Total Salary = "+totalSalary);
	}
	void getEmp() {
		System.out.println("Employee Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 
}
