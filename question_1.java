package Assignment_6NestedForLoop;

public class question_1 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the following pattern

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
		 */
	
	for(int row=1; row <=7; row++) {
		
		for (int col=1; col <=row; col++) {
			System.out.print(col+" ");
		}
	System.out.println();
	
	}
	for(int row=6	; row >=1; row--) {
		
		for (int col=1; col <=row; col++) {
			System.out.print(col+" ");
	}
System.out.println();

	}}}
