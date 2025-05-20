import java.util.*;
class DuplicateElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                System.out.println("The elements without duplicates: "+arr[i]);
            }
        }
    }
}