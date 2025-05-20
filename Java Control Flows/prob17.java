import java.util.Scanner;

public class prob17 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Salary: ");
		int n=input.nextInt();
		System.out.print("Enter your Year of Service: ");
		int m=input.nextInt();
		double discount=n*5/100;
		if(2025-m > 5){
			System.out.println("Your Bonus amount is: "+discount);
		}
		else{
			System.out.println("You are not Elgible for bonus");
		}
	}
}	