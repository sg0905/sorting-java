public class SelectionSort {
    public static void run(int ar[]) {
        System.out.println("Original Array:");
        int len = ar.length;
        for(int i=0;i<len;i++ ){
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        
        //      Selection sort is a sorting technique that starts with the first element and 
        //                                                          finds the smallest elements from the array and places it at its appropriate position
        for(int i=0;i<len;i++ ){
            for(int j=i+1; j< ar.length; j++){
                if(ar[i]>ar[j]){
                    int temp = ar[i];
                    ar[i]= ar[j];
                    ar[j] = temp;
                }
            }
        }
            System.out.println("Sorted Array");
            for(int i=0;i<len;i++ ){
                System.out.print(ar[i]+ " ");
            }
            System.out.println();
        
    }
    public static void main(String args[]){
        int ar[]= { 10,25,100,5,1000,14,102
        };
        SelectionSort ss= new SelectionSort();
        ss.run(ar);
    }
    
}
