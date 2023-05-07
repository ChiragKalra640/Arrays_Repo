///////////BUBBLE SORTING/////////////

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s1  = new Scanner(System.in);
        
        int a[] = new int[10];
        System.out.println("Enter elements");
        for(int i=0;i<10;i++){
            a[i] = s1.nextInt();
        }

        System.out.println("\nUnsorted arrays is : ");
        for(int i=0;i<10;i++){
            System.out.println(a[i]+ ",");
        }

        //Bubble Sorting
        for(int i=0;i<10-1;i++){
            for(int j=0;j<10-i-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }

        System.out.println("\nSorted arrays is");
        for(int i=0;i<10;i++){
            System.out.println(a[i]+ ",");
        }

    }
    
}
