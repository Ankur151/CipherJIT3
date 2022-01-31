////Merge Sort
//class sorting 
//{
//    void merge(int arr[], int left, int middle, int right)
//    {
//        int low = middle - left + 1;                    //size of the left subarray
//        int high = right - middle;                      //size of the right subarray
// 
//        int L[] = new int[low];                             //create the left and right subarray
//        int R[] = new int[high];
//
//        int i = 0, j = 0;
// 
//        for (i = 0; i < low; i++)                               //copy elements into left subarray
//        {
//            L[i] = arr[left + i];
//        }
//        for (j = 0; j < high; j++)                              //copy elements into right subarray
//        {
//            R[j] = arr[middle + 1 + j];
//        }
//        
// 
//        int k = left;                                           //get starting index for sort
//        i = 0;                                             //reset loop variables before performing merge
//        j = 0;
//
//        while (i < low && j < high)                     //merge the left and right subarrays
//        {
//            if (L[i] <= R[j]) 
//            {
//                arr[k] = L[i];
//                i++;
//            }
//            else 
//            {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
// 
//        while (i < low)                             //merge the remaining elements from the left subarray
//        {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
// 
//        while (j < high)                           //merge the remaining elements from right subarray
//        {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
// 
//
//    void mergeSort(int arr[], int left, int right)       //helper function that creates the sub cases for sorting
//    {
//        int middle;
//        if (left < right) {                             //sort only if the left index is lesser than the right index (meaning that sorting is done)
//            middle = (left + right) / 2;
// 
//            mergeSort(arr, left, middle);                    //left subarray
//            mergeSort(arr, middle + 1, right);               //right subarray
// 
//            merge(arr, left, middle, right);                //merge the two subarrays
//        }
//    }
// 
//    void display(int arr[])                 //display the array
//    {  
//        for (int i=0; i<arr.length; ++i) 
//        {
//            System.out.print(arr[i]+" ");
//        } 
//    } 
//
//    public static void main(String args[])
//    {
//        int arr[] = { 9, 3, 1, 5, 13, 12 };
//        sorting ob = new sorting();
//        ob.mergeSort(arr, 0, arr.length - 1);
//        ob.display(arr);
//    }
//}
































////Insertion Sort
//class sorting  
//{ 
//    static void insertionSort(int arr[], int n) 
//    { 
//        if (n <= 1)                             //passes are done
//        {
//            return; 
//        }
//
//        insertionSort( arr, n-1 );        //one element sorted, sort the remaining array
//       
//        int last = arr[n-1];                        //last element of the array
//        int j = n-2;                                //correct index of last element of the array
//       
//        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
//        { 
//            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
//            j--; 
//        } 
//        arr[j+1] = last;                            //set the last element at its correct index
//    } 
//
//    void display(int arr[])                 //display the array
//    {  
//        for (int i=0; i<arr.length; ++i) 
//        {
//            System.out.print(arr[i]+" ");
//        } 
//    } 
// 
//       
//    public static void main(String[] args) 
//    { 
//        int arr[] = {22, 21, 11, 15, 16}; 
//       
//        insertionSort(arr, arr.length); 
//        sorting ob = new sorting();
//        ob.display(arr); 
//    } 
//} 





























////Selection Sort
//class sorting 
//{ 
//    void selectionSort(int arr[]) 
//    { 
//        int pos;
//        int temp;
//        for (int i = 0; i < arr.length; i++) 
//        { 
//            pos = i; 
//            for (int j = i+1; j < arr.length; j++) 
//           {
//                if (arr[j] < arr[pos])                  //find the index of the minimum element
//                {
//                    pos = j;
//                }
//            }
//
//            temp = arr[pos];            //swap the current element with the minimum element
//            arr[pos] = arr[i]; 
//            arr[i] = temp; 
//        } 
//    } 
//  
//    void display(int arr[])                     //display the array
//    { 
//        for (int i=0; i<arr.length; i++) 
//        {
//            System.out.print(arr[i]+" ");
//        }  
//    } 
//  
//    public static void main(String args[]) 
//    { 
//        sorting ob = new sorting(); 
//        int arr[] = {64,25,12,22,11}; 
//        ob.selectionSort(arr); 
//        ob.display(arr); 
//    } 
//} 





















////Bubble Sort
//class sorting 
//{
//    static void bubbleSort(int arr[], int n)
//    {                                       
//        if (n == 1)                     //passes are done
//        {
//            return;
//        }
//
//        for (int i=0; i<n-1; i++)       //iteration through unsorted elements
//        {
//            if (arr[i] > arr[i+1])      //check if the elements are in order
//            {                           //if not, swap them
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//            
//        bubbleSort(arr, n-1);           //one pass done, proceed to the next
//    }
//
//    void display(int arr[])                 //display the array
//    {  
//        for (int i=0; i<arr.length; ++i) 
//        {
//            System.out.print(arr[i]+" ");
//        } 
//    } 
//     
//    public static void main(String[] args)
//    {
//        sorting ob = new sorting();
//        int arr[] = {6, 4, 5, 12, 2, 11, 9};    
//        bubbleSort(arr, arr.length);
//        ob.display(arr);
//    }
//}

































//// Java implementation of QuickSort
//import java.io.*;
//
//class sorting{
//	
//// A utility function to swap two elements
//static void swap(int[] arr, int i, int j)
//{
//	int temp = arr[i];
//	arr[i] = arr[j];
//	arr[j] = temp;
//}
//
///* This function takes last element as pivot, places
//the pivot element at its correct position in sorted
//array, and places all smaller (smaller than pivot)
//to left of pivot and all greater elements to right
//of pivot */
//static int partition(int[] arr, int low, int high)
//{
//	
//	// pivot
//	int pivot = arr[high];
//	
//	// Index of smaller element and
//	// indicates the right position
//	// of pivot found so far
//	int i = (low - 1);
//
//	for(int j = low; j <= high - 1; j++)
//	{
//		
//		// If current element is smaller
//		// than the pivot
//		if (arr[j] < pivot)
//		{
//			
//			// Increment index of
//			// smaller element
//			i++;
//			swap(arr, i, j);
//		}
//	}
//	swap(arr, i + 1, high);
//	return (i + 1);
//}
//
//	/* The main function that implements QuickSort
//			arr[] --> Array to be sorted,
//			low --> Starting index,
//			high --> Ending index
//	*/
//	static void quickSort(int[] arr, int low, int high)
//	{
//		if (low < high)
//		{
//			
//			// pi is partitioning index, arr[p]
//			// is now at right place
//			int pi = partition(arr, low, high);
//	
//			// Separately sort elements before
//			// partition and after partition
//			quickSort(arr, low, pi - 1);
//			quickSort(arr, pi + 1, high);
//		}
//	}
//
//	// Function to print an array
//	static void printArray(int[] arr, int size)
//	{
//		for(int i = 0; i < size; i++)
//			System.out.print(arr[i] + " ");
//			
//		System.out.println();
//	}
//
//	// Driver Code
//	public static void main(String[] args)
//	{
//		int[] arr = { 10, 7, 8, 9, 1, 5 };
//		int n = arr.length;
//		
//		quickSort(arr, 0, n - 1);
//		System.out.println("Sorted array: ");
//		printArray(arr, n);
//	}
//}




































//// Radix sort Java implementation
//import java.io.*;
//import java.util.*;
//
//class sorting {
//
//	// A utility function to get maximum value in arr[]
//	static int getMax(int arr[], int n)
//	{
//		int mx = arr[0];
//		for (int i = 1; i < n; i++)
//			if (arr[i] > mx)
//				mx = arr[i];
//		return mx;
//	}
//
//	// A function to do counting sort of arr[] according to
//	// the digit represented by exp.
//	static void countSort(int arr[], int n, int exp)
//	{
//		int output[] = new int[n]; // output array
//		int i;
//		int count[] = new int[10];
//		Arrays.fill(count, 0);
//
//		// Store count of occurrences in count[]
//		for (i = 0; i < n; i++)
//			count[(arr[i] / exp) % 10]++;
//
//		// Change count[i] so that count[i] now contains
//		// actual position of this digit in output[]
//		for (i = 1; i < 10; i++)
//			count[i] += count[i - 1];
//
//		// Build the output array
//		for (i = n - 1; i >= 0; i--) {
//			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
//			count[(arr[i] / exp) % 10]--;
//		}
//
//		// Copy the output array to arr[], so that arr[] now
//		// contains sorted numbers according to current digit
//		for (i = 0; i < n; i++)
//			arr[i] = output[i];
//	}
//
//	// The main function to that sorts arr[] of size n using
//	// Radix Sort
//	static void radixsort(int arr[], int n)
//	{
//		// Find the maximum number to know number of digits
//		int m = getMax(arr, n);
//
//		// Do counting sort for every digit. Note that
//		// instead of passing digit number, exp is passed.
//		// exp is 10^i where i is current digit number
//		for (int exp = 1; m / exp > 0; exp *= 10)
//			countSort(arr, n, exp);
//	}
//
//	// A utility function to print an array
//	static void print(int arr[], int n)
//	{
//		for (int i = 0; i < n; i++)
//			System.out.print(arr[i] + " ");
//	}
//
//	/*Driver Code*/
//	public static void main(String[] args)
//	{
//		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
//		int n = arr.length;
//		
//		// Function Call
//		radixsort(arr, n);
//		print(arr, n);
//	}
//}


























//// Java program to perform TimSort.
//class sorting
//{
//
//	static int MIN_MERGE = 32;
//
//	public static int minRunLength(int n)
//	{
//		assert n >= 0;
//	
//		// Becomes 1 if any 1 bits are shifted off
//		int r = 0;
//		while (n >= MIN_MERGE)
//		{
//			r |= (n & 1);
//			n >>= 1;
//		}
//		return n + r;
//	}
//
//	// This function sorts array from left index to
//	// to right index which is of size atmost RUN
//	public static void insertionSort(int[] arr, int left,
//									int right)
//	{
//		for (int i = left + 1; i <= right; i++)
//		{
//			int temp = arr[i];
//			int j = i - 1;
//			while (j >= left && arr[j] > temp)
//			{
//				arr[j + 1] = arr[j];
//				j--;
//			}
//			arr[j + 1] = temp;
//		}
//	}
//
//	// Merge function merges the sorted runs
//	public static void merge(int[] arr, int l,
//								int m, int r)
//	{
//		// Original array is broken in two parts
//		// left and right array
//		int len1 = m - l + 1, len2 = r - m;
//		int[] left = new int[len1];
//		int[] right = new int[len2];
//		for (int x = 0; x < len1; x++)
//		{
//			left[x] = arr[l + x];
//		}
//		for (int x = 0; x < len2; x++)
//		{
//			right[x] = arr[m + 1 + x];
//		}
//
//		int i = 0;
//		int j = 0;
//		int k = l;
//
//		// After comparing, we merge those two array
//		// in larger sub array
//		while (i < len1 && j < len2)
//		{
//			if (left[i] <= right[j])
//			{
//				arr[k] = left[i];
//				i++;
//			}
//			else {
//				arr[k] = right[j];
//				j++;
//			}
//			k++;
//		}
//
//		// Copy remaining elements
//		// of left, if any
//		while (i < len1)
//		{
//			arr[k] = left[i];
//			k++;
//			i++;
//		}
//
//		// Copy remaining element
//		// of right, if any
//		while (j < len2)
//		{
//			arr[k] = right[j];
//			k++;
//			j++;
//		}
//	}
//
//	// Iterative Timsort function to sort the
//	// array[0...n-1] (similar to merge sort)
//	public static void timSort(int[] arr, int n)
//	{
//		int minRun = minRunLength(MIN_MERGE);
//	
//		// Sort individual subarrays of size RUN
//		for (int i = 0; i < n; i += minRun)
//		{
//			insertionSort(arr, i,
//						Math.min((i + MIN_MERGE - 1), (n - 1)));
//		}
//
//		// Start merging from size
//		// RUN (or 32). It will
//		// merge to form size 64,
//		// then 128, 256 and so on
//		// ....
//		for (int size = minRun; size < n; size = 2 * size)
//		{
//
//			// Pick starting point
//			// of left sub array. We
//			// are going to merge
//			// arr[left..left+size-1]
//			// and arr[left+size, left+2*size-1]
//			// After every merge, we
//			// increase left by 2*size
//			for (int left = 0; left < n;
//								left += 2 * size)
//			{
//
//				// Find ending point of left sub array
//				// mid+1 is starting point of right sub
//				// array
//				int mid = left + size - 1;
//				int right = Math.min((left + 2 * size - 1),
//									(n - 1));
//
//				// Merge sub array arr[left.....mid] &
//				// arr[mid+1....right]
//				if(mid < right)
//					merge(arr, left, mid, right);
//			}
//		}
//	}
//
//	// Utility function to print the Array
//	public static void printArray(int[] arr, int n)
//	{
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.print("\n");
//	}
//
//	// Driver code
//	public static void main(String[] args)
//	{
//		int[] arr = { -2, 7, 15, -14, 0, 15, 0, 7,
//					-7, -4, -13, 5, 8, -14, 12 };
//		int n = arr.length;
//		System.out.println("Given Array is");
//		printArray(arr, n);
//
//		timSort(arr, n);
//
//		System.out.println("After Sorting Array is");
//		printArray(arr, n);
//	}
//}




























//// Java implementation of ShellSort
//class sorting
//{
//	/* An utility function to print array of size n*/
//	static void printArray(int arr[])
//	{
//		int n = arr.length;
//		for (int i=0; i<n; ++i)
//			System.out.print(arr[i] + " ");
//		System.out.println();
//	}
//
//	/* function to sort arr using shellSort */
//	int sort(int arr[])
//	{
//		int n = arr.length;
//
//		// Start with a big gap, then reduce the gap
//		for (int gap = n/2; gap > 0; gap /= 2)
//		{
//			// Do a gapped insertion sort for this gap size.
//			// The first gap elements a[0..gap-1] are already
//			// in gapped order keep adding one more element
//			// until the entire array is gap sorted
//			for (int i = gap; i < n; i += 1)
//			{
//				// add a[i] to the elements that have been gap
//				// sorted save a[i] in temp and make a hole at
//				// position i
//				int temp = arr[i];
//
//				// shift earlier gap-sorted elements up until
//				// the correct location for a[i] is found
//				int j;
//				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
//					arr[j] = arr[j - gap];
//
//				// put temp (the original a[i]) in its correct
//				// location
//				arr[j] = temp;
//			}
//		}
//		return 0;
//	}
//
//	// Driver method
//	public static void main(String args[])
//	{
//		int arr[] = {12, 34, 54, 2, 3};
//		System.out.println("Array before sorting");
//		printArray(arr);
//
//		sorting ob = new sorting();
//		ob.sort(arr);
//
//		System.out.println("Array after sorting");
//		printArray(arr);
//	}
//}
