import java.util.Scanner;

class prob3 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int number1 = scanner.nextInt();  
      System.out.print("Enter the second number: ");
      int number2 = scanner.nextInt();    
      System.out.print("Enter the third number: ");
      int number3 = scanner.nextInt();
      boolean a = (number1 < number2 && number1 < number3);
	  boolean b = (number2 < number1 && number2 < number3);
	  boolean c = (number3 < number1 && number3 < number2);
      System.out.println("Is the first number the smallest? " + a); 
      System.out.println("Is the second number the smallest? " + b);
      System.out.println("Is the third number the smallest? " + c);	  
   }
}
