	//OOPS  Concept inheritance -single level ,super class--extends-->sub class
	package DAY8_AJP;
	public class RBI {
		int Bankcode;
		String name;
		String type;
		RBI(){
			System.out.println("RBI CONSTUCTOR");
		}
		public RBI(int bankcode, String name, String type) {
			super();
			Bankcode = bankcode;
			this.name = name;
			this.type = type;
			System.out.println("Bank Details : "+name+",Bankcode : "+Bankcode);
		}
		@SuppressWarnings("unused")
		public static void main(String args [] ){
			RBI r=new RBI();
		}
		
	}
