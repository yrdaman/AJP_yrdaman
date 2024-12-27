package Day7_AJP;

public class LoopExit {
	static void Exmul3(int range) {
		for(int i =1;i<=range;i++) {
			if (i%3==0) {
								continue;
			}System.out.println(i);
			
		}
	}
	public static void main(String[] args) {
		Exmul3(30);

	}

}
