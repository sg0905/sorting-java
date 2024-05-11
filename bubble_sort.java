public class bubble_sort{
    public static void main(String args[]){
        int ar[]={64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array");
        for(int i : ar){
            System.out.print(i + " ");

        }
        System.out.println();
        int len=ar.length;
        for(int i =0; i< len; i++){
            for(int j =0 ;j< len-1-i; j++){
                if(ar[j]> ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int i : ar){
            System.out.print(i+ " ");
        }
    }
} 