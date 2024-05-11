public class insertion_sort {
    public static void main(String args[]){
        int ar[]= { 125,10,25,65,100,12444,1253};
        System.out.println("Original array:");
        printArray(ar);

        insertionSort(ar);

        System.out.println("\nSorted array:");
        printArray(ar);
    }
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        
        }
    }
}

