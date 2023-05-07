import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter total number you want to enter");
        int n = s1.nextInt();

        System.out.println("enter " +n+ " numbers");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s1.nextInt();
        }
        System.out.println("Enter no. you want to search");
        int searchNum = s1.nextInt();

        int pos = -1;
        for(int i=0;i<n;i++){
            if(a[i]== searchNum){
                pos = i;
                break;
            }
        }
        if(pos==-1){
            System.out.println("Search unsuccessful");
        }else {
            System.out.println("Element found at " +(pos+1)+ " position");
        }

    }
    
}
