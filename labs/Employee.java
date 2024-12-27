package labs;

public class Employee extends User {
	double salary;
	static double Annual_salary;
	public Employee(int id, String name,double salary) {
		super(id, name);
		this.salary=salary;
		
	}
	// Method to calculate annual salary
    public double calculateAnnualSalary() {
    	
    	Annual_salary=salary * 12;
		return Annual_salary;
    }
    	//get method for salary
    	public double getSalary() {
            return salary;
        }

        // Setter method for salary
        public void setSalary(double salary) {
            this.salary = salary;
        
    }

	public static void main(String[] args) {
		Employee emp=new Employee(22704,"MUSK",200000);
		emp.calculateAnnualSalary();
		System.out.println("Annual Salary of " + emp.getName() + " (ID: " + emp.getId() + ")  : $ " + Annual_salary+"/-");

	}

}
