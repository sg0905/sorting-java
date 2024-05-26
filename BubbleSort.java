import java.util.*;

public class BubbleSort{
    public static void sort(int ar[]){
        System.out.println("Original Array");
        for(int i: ar){
            System.out.println(i + " ");
        }
        System.out.println();

        // Bubble sort is a sorting technique where the adjacent elements are compared and swapping takes place. This continue till the last of the list.

        for(int i : ar){
            for(int j=0; j<ar.length-1-i; j++){
                if(ar[j]>ar[j+1]){
                    int temp = ar[j+1];
                    ar[j+1] = ar[j];
                    ar[j]= temp;
                }
            }
        }
        System.out.println("Sorted Array :");
        for(int i : ar){
            System.out.print(ar[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        BubbleSort bs= new BubbleSort();
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of Array");
        int num = sc.nextInt();
        System.out.println("Enter the elements in array");
        int ar[] = new int[num];
        for(int i :ar){
            ar[i]= sc.nextInt();
        }
        bs.sort(ar);
    }
}




// public class bubble_sort{
//     public static void main(String args[]){
//         int ar[]={64, 34, 25, 78, 10, 74, 01, 100};
//         System.out.println("Original Array");
//         for(int i : ar){
//             System.out.print(i + " ");

//         }
//         System.out.println();
//         int len=ar.length;
//         for(int i =0; i< len; i++){
//             for(int j =0 ;j< len-1-i; j++){
//                 if(ar[j]> ar[j+1]){
//                     int temp=ar[j];
//                     ar[j]=ar[j+1];
//                     ar[j+1]=temp;
//                 }
//             }
//         }
//         for(int i : ar){
//             System.out.print(i+ " ");
//         }
//     }
// } 