package Assignment_6NestedForLoop;

public class question_6 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the following pattern

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
		 */

	
		
			for(int x=1;x<=5;x++) {
			int a=0,b=4;
			for(int y=1;y<=x; y++){
			int s=x+a;
			System .out.print (s+" ");
			a=a+b; b--; }
			System .out .println ();
	
	}

}}
