import java.util.Scanner;

class prob7 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the month (1-12): ");
      int month = scanner.nextInt();     
      System.out.print("Enter the day: ");
      int day = scanner.nextInt();  
      boolean SpringSeason = (month == 3 && day >= 20) || 
                         (month == 4) || 
                         (month == 5) || 
                         (month == 6 && day <= 20); 
      if (SpringSeason) {
          System.out.println("It's a Spring Season");
      } else {
          System.out.println("Not a Spring Season");
      }						 
    }
}