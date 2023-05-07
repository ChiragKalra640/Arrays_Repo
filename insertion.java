import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a[] = new int[50]; //capacity of this array is 50
        System.out.println("Enter the size of an array ");
        int size = s1.nextInt();

        System.out.println("Enter the elements of an array :");
        for(int i=0;i<size;i++){
            a[i] = s1.nextInt(); 
        }

        System.out.println("ARRAY BEFORE INSERTION : ");
        for(int i=0;i<size;i++){
            System.out.println(a[i] + ", ");
        }

        //insertion
        System.out.println("\nEnter the value to be inserted ");
        int x = s1.nextInt();

        System.out.println("\nEnter the position or index where you want to insert ");
        int pos = s1.nextInt();

        //shifting of element
        for(int i=size;i>pos;i--){
            a[i]=a[i-1];
        }
        a[pos] = x;
        ++size;

        System.out.println("ARRAY AFTER INSERTION : ");
        for(int i=0;i<size;i++){
            System.out.println(a[i]+ ",");
        }



    }
    
}
