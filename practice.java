import java.util.*;

//public class practice {
//
//	public static void main(String[] args) {
//		   int nums[] = {20, 20, 30, 40, 50, 50, 50};  
//			System.out.println("Original array length: "+nums.length);
//			System.out.print("Array elements are: ");
//	       for (int i = 0; i < nums.length; i++)
//	        {
//	            System.out.print(nums[i]+" ");
//	        }
//			System.out.println("\nThe new length of the array is: "+array_sort(nums));
//				
//	    }
//	    
//	    public static int array_sort(int[] nums) {
//	         int index = 1;
//	        for (int i = 1; i < nums.length; i++) {
//	            if (nums[i] != nums[index-1])
//	                nums[index++] = nums[i];
//	        }
//		  return index;
//	    }
//
//}







////Java Program to Print Pascal's Triangle
////Main Class
//public class practice {
//
//	// Method 1
//	// To find factorial of a number
//	public int factorial(int a)
//	{
//		// Edge case
//		// Factorial of 0 is unity
//		if (a == 0)
//
//			// Hence return 1
//			return 1;
//
//		// else recursively call the function over the
//		// number whose facoial is to be computed
//		return a * factorial(a - 1);
//	}
//
//	// Method 2
//	// Main driver method
//	public static void main(String[] args)
//	{
//		// Declare and initialize number whose
//		// factorial is to be computed
//		int k = 4;
//
//		int a, b;
//
//		// Creating an object of GFG class
//		// in the main() method
//		practice g = new practice();
//
//		// iterating using nested for loop to traverse over
//		// matrix
//
//		// Outer for loop
//		for (a = 0; a <= k; a++) {
//
//			// Inner loop 1
//			for (b = 0; b <= k - a; b++) {
//
//				// Print white space for left spacing
//				System.out.print(" ");
//			}
//
//			// Inner loop 2
//			for (b = 0; b <= a; b++) {
//
//				// nCr formula
//				System.out.print(
//					" "
//					+ g.factorial(a)
//						/ (g.factorial(a - b)
//							* g.factorial(b)));
//			}
//
//			// By now, we are done with one row so
//			// a new line
//			System.out.println();
//		}
//	}
//}







////Java program to convert Hexadecimal to Decimal Number
//
//
////Main class
//class practice {
//
//	// Method
//	// To convert hexadecimal to decimal
//	static int hexadecimalToDecimal(String hexVal)
//	{
//		// Storing the length of the
//		int len = hexVal.length();
//
//		// Initializing base value to 1, i.e 16^0
//		int base = 1;
//
//		// Initially declaring and initializing
//		// decimal value to zero
//		int dec_val = 0;
//
//		// Extracting characters as
//		// digits from last character
//
//		for (int i = len - 1; i >= 0; i--) {
//
//			// Condition check
//			// Case 1
//			// If character lies in '0'-'9', converting
//			// it to integral 0-9 by subtracting 48 from
//			// ASCII value
//			if (hexVal.charAt(i) >= '0'
//				&& hexVal.charAt(i) <= '9') {
//				dec_val += (hexVal.charAt(i) - 48) * base;
//
//				// Incrementing base by power
//				base = base * 16;
//			}
//
//			// Case 2
//			// if case 1 is bypassed
//
//			// Now, if character lies in 'A'-'F' ,
//			// converting it to integral 10 - 15 by
//			// subtracting 55 from ASCII value
//			else if (hexVal.charAt(i) >= 'A'
//					&& hexVal.charAt(i) <= 'F') {
//				dec_val += (hexVal.charAt(i) - 55) * base;
//
//				// Incrementing base by power
//				base = base * 16;
//			}
//		}
//
//		// Returning the decimal value
//		return dec_val;
//	}
//
//	// Method 2
//	// Main driver method
//	public static void main(String[] args)
//	{
//		// Custom input hexadecimal number to be
//		// converted into decimal number
//		String hexNum = "1A";
//
//		// Calling the above method to convert and
//		// alongside printing the hexadecimal number
//		System.out.println(hexadecimalToDecimal(hexNum));
//	}
//}

















//
//public class practice {    
//   public static void main(String[] args) {
//        int nums[] = {49, 1, 3, 200, 2, 4, 70, 5};  
//		System.out.println("Original array length: "+nums.length);
//		System.out.print("Array elements are: ");
//       for (int i = 0; i < nums.length; i++)
//        {
//            System.out.print(nums[i]+" ");
//        }
//		System.out.println("\nThe new length of the array is: "+longest_sequence(nums));
//			
//    }
//    
//    public static int longest_sequence(int[] nums) {
//      final HashSet<Integer> h_set = new HashSet<Integer>();
//        for (int i : nums) h_set.add(i);
//
//        int longest_sequence_len = 0;
//        for (int i : nums) {
//            int length = 1;
//            for (int j = i - 1; h_set.contains(j); --j) {
//                h_set.remove(j);
//                ++length;
//            }
//            for (int j = i + 1; h_set.contains(j); ++j) {
//                h_set.remove(j);
//                ++length;
//            }
//            longest_sequence_len = Math.max(longest_sequence_len, length);
//        }
//        return longest_sequence_len;
//    }
//}








//public class practice
//{
//        public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {
//        
//        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        result.add(0);
//        result.add(1);
//        for(int i = 0; i < a.size(); i++){
//            if(my_map.containsKey(a.get(i))){
//                int index = my_map.get(a.get(i));
//                result.set(0, index );
//                result.set(1, i );
//                break;
//            }
//            else{
//                my_map.put(b - a.get(i), i);
//            }
//        }
//        
//        return result;
//    }
//  
//    public static void main(String[] args){
//        ArrayList<Integer> my_array = new ArrayList<Integer>();
//        my_array.add(1);
//        my_array.add(2);
//        my_array.add(4);
//        my_array.add(5);
//		my_array.add(6);
//		int target = 6;
//        ArrayList<Integer> result = two_sum_array_target(my_array, target);
//        for(int i : result)
//            System.out.print("Index: "+i + " ");
//    }
//}













//public class practice {
//
//    
//  public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input floating-point number: ");
//        double x = in.nextDouble();
//        System.out.print("Input floating-point another number: ");
//        double y = in.nextDouble();
//
//        x = Math.round(x * 1000);
//        x = x / 1000;
//
//        y = Math.round(y * 1000);
//        y = y / 1000;
//
//        if (x == y)
//        {
//            System.out.println("They are the same up to three decimal places");
//        }
//        else
//        {
//            System.out.println("They are different");
//        }
//    }
//}
