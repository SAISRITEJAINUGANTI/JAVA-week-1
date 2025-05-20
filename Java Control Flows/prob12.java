import java.util.Scanner;

class prob12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
        int n = input.nextInt();
		if (n <= 0) {
          System.out.println("Please enter a positive natural number.");
        } 
		else {
          // Compute sum using while loop
          int sumWhileLoop = 0, i = 1;
          while (i <= n) {
              sumWhileLoop += i;
              i++;
            }
		  int sumFormula = n * (n + 1) / 2;
          
          // Compare and print the results
          System.out.println("Sum using while loop: " + sumWhileLoop);
          System.out.println("Sum using formula: " + sumFormula);
          
            if (sumWhileLoop == sumFormula) {
              System.out.println("Both computations match!");
            } 
			else {
              System.out.println("There is a mismatch in the computations! ");
            }
        }
	}
}	