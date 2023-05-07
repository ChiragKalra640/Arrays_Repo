public class min_value {
    public static void main(String[] args) {
        
        //An array of 10 elements
        int a[] = {20,10,100,50,5,60,2,90,32,45};

        int min = a[0];
        int pos =0;
        for(int i=0;i<10;i++){
            if(a[i]<min){  // min>a[i]
                min = a[i];
                pos = i;
            }
        }
        System.out.println("min element is " +min+ " at position "+(pos+1));
    }
}
