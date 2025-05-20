import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr.length < 3) {
            System.out.println("-1");
        } else {
            System.out.println(arr[2]);
        }
    }
}
