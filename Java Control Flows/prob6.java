import java.util.Scanner;

class prob6 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num = scanner.nextInt();  
      if(num >0){
		  System.out.println("Positive");
	    }
	  else if(num==0){
          System.out.println("Zero");
	    }
      else{
          System.out.println("Negative");
	    } 		  
    }
}