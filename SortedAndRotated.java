import java.util.*;

public class SortedAndRotated {
    // java program to check an array is sorted and rotated



    // Function to check if arr[] is rotated and sorted
    public static boolean check(int[] arr, int n)
    {
        // Initialize count of the number of times the
        // sequence is out of order
        int count = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than
            // the next element
            if (arr[i] > arr[(i + 1) % n]) {
                // Increment count if the sequence is out of
                // order
                count++;
            }
        }

        // Return true if there is at most one point where
        // the sequence is out of order
        return count <= 1;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        // Sample Input
          // Example of a rotated and sorted array
          int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        // Call the check function and determine if the
        // array is rotated and sorted
        if (check(arr, n))
            // Print YES if the array is rotated and sorted
            System.out.println("YES");
        else
            // Print NO if the array is not rotated and
            // sorted
            System.out.println("NO");
            s.close();
    }
}


