import java.util.ArrayList;
import java.util.Collections;

public class bucket_sort {
        public static void main(String[] args) {
        double[] arr = {0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51};

        System.out.println("Original array:");
        printArray(arr);

        bucketSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    // Function to perform bucket sort
    static void bucketSort(double[] arr) {
        int n = arr.length;
        int numOfBuckets = n;

        // Create empty buckets
        ArrayList<Double>[] buckets = new ArrayList[numOfBuckets];
        for (int i = 0; i < numOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (numOfBuckets * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket individually
        for (int i = 0; i < numOfBuckets; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate all buckets into the original array
        int index = 0;
        for (int i = 0; i < numOfBuckets; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    // Utility function to print an array
    static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
