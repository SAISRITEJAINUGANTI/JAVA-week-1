import java.util.Scanner;

public class prob2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = {"Amar", "Akbar", "Anthony"};
		int[] ages = new int[3];
		int[] heights = new int[3];
		for (int i=0; i<3;i++){
			System.out.print("Enter age of "+ names[i] +": ");
			ages[i] = scanner.nextInt();
			System.out.print("Enter height of " + names[i] +": ");
			heights[i] = scanner.nextInt();
		}
		int minAge = ages[0];
		String youngest = names[0];
		for(int i=0;i<3;i++) {
			if(ages[i]<minAge){
				minAge=ages[i];
				youngest=names[i];
			}
		}
		int maxheight=heights[0];
		String tallest = names[0];
		for(int i=0;i<3;i++){
			if(heights[i]< maxheight){
				maxheight=heights[i];
				tallest= names[i];
			}
		}
		System.out.println("The youngest friend is: " + youngest + " with age " + minAge);
        System.out.println("The tallest friend is: " + tallest + " with height " + maxheight + " cm");
	}
}	