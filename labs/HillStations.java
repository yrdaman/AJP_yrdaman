package labs;

//Hillstations problem

public class HillStations {
	void location() {
		System.out.println("Location : ");
	}
	void famousFor() {
		System.out.println("Famous for : ");
	}
	public static void main(String[] args) {
		//Calling methods from the parent class(Hillstations)
		System.out.println("Calling methods from the parent class(Hillstations):");
		HillStations hs =new HillStations();
		hs.location();
		hs.famousFor();
		
		//Calling methods from the sub class (Manali)
		System.out.println("Calling methods from the parent class(Manali):");
		Manali mn=new Manali();
		mn.location();
		mn.famousFor();
		
		//Calling methods from the sub class (Mussoorie)
		System.out.println("Calling methods from the parent class(Mussoorie):");
		Mussorie ms=new Mussorie();
		ms.location();
		ms.famousFor();
		
		//Calling methods from the sub class (Gulmarg)
		System.out.println("Calling methods from the parent class(Gulmarg):");
		Gulmarg gu=new Gulmarg();
		gu.location();
		gu.famousFor();


	}

}
