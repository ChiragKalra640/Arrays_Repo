import java.util.Scanner;

class array1{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("enter total numbers of contact number you want to enter");
        int  n = s1.nextInt();

        System.out.println("enter" +n+ "contact numbers");
        long contact[] = new long[n];
        for (int i=0;i<n;i++){
            contact[i] = s1.nextLong();
        }
        System.out.println("Dear customer you have entered");
        for(int i=0;i<n;i++){
            System.out.println(contact[i]+ ",");
        }
    }
}

// import java.util.Scanner;

// public class random {
//     public static void main(String[] args) {
        
       
//         //Wap to print 10 vlaues from the user and print them
//         Scanner s1 = new Scanner(System.in);

//         System.out.println("enter total phone numbers you want to enter");
//         int n = s1.nextInt();

//         System.out.println("enter " +n+ "numbers");
//         //input
//         long b[] = new long[n];
//         for(int i=0;i<n;i++){
//             b[i] = s1.nextLong();
//         } 
//         // work operation
//         //print
//         System.out.println("dear customer you heve entered");
//         for(int i=0;i<n;i++){
//             System.out.println(b[i]+ ",");
//         }
        

//     }
// }
