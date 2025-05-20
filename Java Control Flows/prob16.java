import java.util.Scanner;

public class prob16 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int n=input.nextInt();
		if (n < 0) {
          System.out.println("Please enter a positive natural number.");
        } 
		else {
			for(int i=1;i<=n;i++){
				if (i%2==0){
					System.out.println(i+ " is Even Number.");
				}
                else{
                    System.out.println(i+ " is Odd Number.");
				}
			}
        }
	}
}	