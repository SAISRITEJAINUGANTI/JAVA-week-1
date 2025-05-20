import java.util.Scanner;

class prob14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
        int n = input.nextInt();
		if (n < 0) {
          System.out.println("Please enter a positive natural number.");
        } 
		else {
          int fact = 1, i = 1;
          while (i <= n) {
              fact = fact*i;
              i++;
            }        
        System.out.println("The factorial of "+n+" is "+ fact);
        }
	}
}	