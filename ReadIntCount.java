package assignment;



public class ReadIntCount {
	public static void main(String[] args) {
		int n = 12378976, count = 0;
		
	    while (n>0) {
			n = n/10;
			count++;
		  }
	    System.out.println("Total digit is :"+count);
	   
	}

}
