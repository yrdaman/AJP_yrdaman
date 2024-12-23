package Day7_AJP;
//for loop
public class ForloopEx {

	public static void main(String[] args) {
		int sum=0,range=20;
		for(int i=0;i<range;i++) {
			if(i%2==0) 
				sum+=i;
		}
		System.out.println(sum);
	}

}
