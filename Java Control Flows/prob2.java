import java.util.Scanner;

class prob2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int number1 = scanner.nextInt();  
      System.out.print("Enter the second number: ");
      int number2 = scanner.nextInt();    
      System.out.print("Enter the third number: ");
      int number3 = scanner.nextInt();
      boolean isDivisible = (number1 < number2 && number1 < number3);
      System.out.println("Is the first number the smallest? " + isDivisible);     
   }
}
