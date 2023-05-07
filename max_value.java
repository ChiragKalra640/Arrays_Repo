import java.util.Scanner;

public class max_value {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter total number you want to enter:");
        int n = s1.nextInt();

        System.out.println("Enter " +n+ " numbers");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
           a[i] = s1.nextInt();
        }

        int max = a[0];
        int pos = 0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max = a[i];
                pos = i;
            }
        }
        System.out.println("maximum is " +max+ " at position " +(pos+1));

    }
}
