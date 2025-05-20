import java.util.Scanner;

class prob9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Counter variable: ");
		int c = input.nextInt();
		for(int i=c;i>0;i--){
			System.out.println(i);
		}	
		System.out.println("BOOOOM!!!");
	}
}	