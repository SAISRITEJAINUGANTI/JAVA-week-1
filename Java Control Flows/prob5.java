import java.util.Scanner;

class prob5 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int age = scanner.nextInt();  
      if(age >=18){
		  System.out.println("The person's age is "+ age+" and can vote.");
	    }
	  else{
          System.out.println("The person's age is "+ age+" and cannot vote.");
	    }		   
    }
}
