

public class SBI extends RBI {
	String address;
	int no_ofEmployees;
	String manager_name;
	SBI(){
		super();
		System.out.println("SBI CONSTRUCTOR");
	}
	
	public SBI(int bankcode, String name, String type,String address, int no_ofEmployees, String manager_name) {
		super(bankcode,name,type);//super();
		this.address = address;
		this.no_ofEmployees = no_ofEmployees;
		this.manager_name = manager_name;
		System.out.println("SBI Details : "+address+","+no_ofEmployees+","+manager_name);
	}

	public static void main(String[] args) {
		SBI sbi=new SBI(2003, "SBI", "National", "Hyderabad", 50, "YRDAMAN");

	}

}
