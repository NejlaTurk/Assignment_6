package Assignment_6NestedForLoop;

public class question_2 {
	
	public static void main(String[] args) {
		/*
		 * Write a Java program to print the following pattern

1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
		 */
		
		
		for (int i = 7; i>= 1 ; i--) {
			
			for (int col= 1; col <= i; col++) {
				System.out.print(col+" ");
			}
		
		System.out.println();
		
		}
		
		for(int i = 1; i<=7; i++) {
			
			for(int col=1; col<= i; col++) {
				System.out.print(col+" ");
			}
		System.out.println();
		
		}
		
		
	}

}
