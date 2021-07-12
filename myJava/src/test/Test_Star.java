package test;

public class Test_Star {

	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		int count = 0;
		
		for(int i = 0; i < line; i++) {
			for(int n = 0; n < count; n++) {
				System.out.print(" ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			star -= 1;
			count += 1;
			System.out.println();
		}
	}

}
