import java.util.Scanner;

public class prob3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of the array: ");
		int size = scanner.nextInt();
		int[] arr = {1,2,1,3,4};
		int temp=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(temp!=arr[i]){
				temp = temp +" "+arr[i];
			}
		}
	}
}
