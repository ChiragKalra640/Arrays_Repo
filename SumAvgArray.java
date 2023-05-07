import java.util.Scanner;

public class SumAvgArray {
    public static void main(String[] args) {
        int sum = 0 , avg=0;
        Scanner s1 = new Scanner(System.in);

        

        System.out.println("Enter total numbers you want to enter");
        int n = s1.nextInt();

        System.out.println("Enter numbers : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s1.nextInt();
        }

        System.out.println("Entered numbers are :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] );
            sum = sum+arr[i];
            avg = sum/n;
             
        }

        System.out.println("Sum of array is " +sum);
        System.out.println("Average of array is " +avg);
    }
    
}
