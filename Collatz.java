// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n1 = Integer.parseInt(args[0]);
		char voc = Character.toUpperCase(args[1].charAt(0));
		int counter = 1;
		Boolean long1 = false;
		if (voc == 'V')
		{
			long1 = true;
		}
		int n2 = 0;
		for (int i = 1; i<= n1; i++) {
			n2 = i;
			if (long1) {System.out.print(n2 + " ");}
			if (i==1) {
				n2=4;
			}
			while (n2!=1) {
				if ( n2%2==0){
					n2 = n2/2;
				}
				else {
					n2= (n2*3)+1;
				}
				if (long1) {System.out.print(n2 +" ");}
				counter++;
				}
				if (long1) {System.out.println("(" + counter +")");}
				counter=1;
			}
			System.out.println("Every one of the first " + n1 + " hailstone sequences reached 1.");

}
}
/*
 % java Collatz 7 v
1 4 2 1 (4)
2 1 (2)
3 10 5 16 8 4 2 1 (8)
4 2 1 (3)
5 16 8 4 2 1 (6)
6 3 10 5 16 8 4 2 1 (9)
7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)
Every one of the first 7 hailstone sequences reached 1.
% java Collatz 100 c
Every one of the first 100 hailstone sequences reached 1.
 */