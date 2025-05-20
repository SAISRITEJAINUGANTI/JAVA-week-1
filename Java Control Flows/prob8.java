import java.util.Scanner;

class prob8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Counter variable: ");
		int c = input.nextInt();
		while (c > 0){
			System.out.println(c);
			c--;
		}
		System.out.println("BOOOOM!!!");
	}
}	