import java.util.Scanner;

class prob11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum=0,c;
		System.out.print("Enter Counter variable: ");
		c = input.nextDouble();
		while (c > 0){
			sum=c+sum;
			c = input.nextDouble();
		}
		System.out.println("The total sum is: "+sum);
	}
}	