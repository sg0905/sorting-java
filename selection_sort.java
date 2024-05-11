public class selection_sort{
    public static void main(String args[]){
        int ar[]={100, 20, 400, 1, 8, 56, 23, 42};
        System.out.println("Original Array");
        display(ar);
        sort_selection(ar);
        System.out.println("\nSorted Array");
        display(ar);
    }
    static void display(int arr[]){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    static void sort_selection(int arr[])
    {
    int len =arr.length;
    for(int i=0;i< len-1 ;i++){
        int min = i;
        for(int j=i + 1; j< len; j++){
            if (arr[j]< arr[min]){
                min=j;
            }
        }
        int temp= arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
        }
    }
}