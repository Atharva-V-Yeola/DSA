

import java.util.*;

public class SecondLargest {

	static private int secondLargestOptimal(int[] arr, int n){
	if(n<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)	{
		if (arr[i] > large){
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large){
			second_large = arr[i];
		}
	}
	return second_large;
	}
	
	static private int secondLargestBetter(int[] arr, int n){
	if(n<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++){
		if (arr[i] > large){
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large){
			second_large = arr[i];
		}
	}
	return second_large;
	}


	static private int secondLargestBrute(int[] arr,int n){
		Arrays.sort(arr);
		return arr[n-2];
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		System.out.println(secondLargestOptimal(arr, n));
		System.out.println(secondLargestBetter(arr, n));
		System.out.println(secondLargestBrute(arr, n));
		s.close();
	}
}

