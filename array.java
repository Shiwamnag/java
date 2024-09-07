import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i;
        System.out.println("Enter 10 values you want to reverse:");
        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(i=9;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
        
    }
}