package assignment;

public class RightTriangle {
	public static void main(String[] args) {
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		int m=1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(" "+m++);
			}
			System.out.println();
		}
	}
}