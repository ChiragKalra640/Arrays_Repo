import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter total number you want to enter");
        int n = s1.nextInt();

        System.out.println("Enter " +n+ " numbers in sorted way");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s1.nextInt();
        }
        System.out.println("Enter number you want to search");
        int searchNum = s1.nextInt();

        int start=0 , end = a.length-1, mid , pos = -1;

        while(start<=end){
            mid = (start+end)/2;
            if(searchNum == a[mid]){
                pos = mid;
                break;
            } 
            else if(searchNum < a[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        if(pos==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " +(pos+1)+" position or at " +pos+ " index");
        }

    }
    
}
