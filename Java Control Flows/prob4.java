import java.util.Scanner;

class prob4 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num = scanner.nextInt();  
      if(num >0){
		  int sum=num*(num+1)/2;
		  System.out.println("The sum of "+ num+" natural numbers is "+sum);
	    }
	  else{
          System.out.println("The number "+ num+" is not a natural number.");
	    }		   
    }
}
