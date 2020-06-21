public class fibonacci {
	public static int of(int num) {
		if(num == 1 || num == 2) {
			return 1;
		}else {
			return of(num - 2) + of(num - 1);
		}
	}
	public static void main(String[] args) {
		for(int i = 1;i <= 200;i++) {
			System.out.print(of(i) +"\t");
		}	
	}
	
}

