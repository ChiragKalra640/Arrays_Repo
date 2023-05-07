import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        int a[] = new int[50]; // capacity of this array is 50
        System.out.println("Enter the size of the array");
        int size = s1.nextInt();

        System.out.println("enter array elements : ");
        for(int i=0;i<size;i++){
            a[i] = s1.nextInt();
        }
        System.out.print("ARRAY BEFORE DELETION :");
        for(int i=0;i<size;i++){
            System.out.print(a[i] + ",");
        }

        //deletion
        System.out.println("\nEnter the position or index to be deleted ");
        int pos = s1.nextInt();

        //shifting the elements
        for(int i=pos ; i<size ; i++){
            a[i]=a[i+1];
        }
        --size;

        System.out.print("ARRAY AFTER DELETION ");
        for(int i=0;i<size;i++){
            System.out.print(a[i] + ",");
        }
    }
    
}
