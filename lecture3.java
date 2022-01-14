import java.util.Scanner;


//public class lecture3 {
//	public static void main(String args[])
//	{
//		String s1 = "TAT";
//		String s2 = "TAT";
//		String s3 = new String("TAT");
//		String s4 = new String("TAT");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//	}
//}







//class lecture3  
//{  
//	public static void main(String[] args)  
//		{  
//			System.out.print("Enter a string: ");  
//			Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
//			
//			String str= sc.nextLine();              //reads string   
//			System.out.print("You have entered: "+str);             
//		}  
//}  

















////Java program to illustrate creating an array
////of integers, puts some values in the array,
////and prints each value to standard output.
//
//class lecture3
//{
//	public static void main (String[] args)
//	{		
//	// declares an Array of integers.
//	int[] arr;
//		
//	// allocating memory for 5 integers.
//	arr = new int[5];
//		
//	// initialize the first elements of the array
//	arr[0] = 10;
//		
//	// initialize the second elements of the array
//	arr[1] = 20;
//		
//	//so on...
//	arr[2] = 30;
//	arr[3] = 40;
//	arr[4] = 50;
//		
//	// accessing the elements of the specified array
//	for (int i = 0; i < arr.length; i++)
//		System.out.println("Element at index " + i +
//									" : "+ arr[i]+" "+arr.length);	
//	
//	}
//}











//// Java program to illustrate creating
//// an array of objects
//
//class Student
//{
//	public int roll_no;
//	public String name;
//	Student(int roll_no, String name)
//	{
//		this.roll_no = roll_no;
//		this.name = name;
//	}
//}
//
//// Elements of the array are objects of a class Student.
//public class lecture3
//{
//	public static void main (String[] args)
//	{
//		// declares an Array of integers.
//		
//
//		// allocating memory for 5 objects of type Student.
//		Student[] arr = new Student[5];
//
//		// initialize the first elements of the array
//		arr[0] = new Student(1,"aman");
//
//		// initialize the second elements of the array
//		arr[1] = new Student(2,"vaibhav");
//
//		// so on...
//		arr[2] = new Student(3,"shikar");
//		arr[3] = new Student(4,"dharmesh");
//		arr[4] = new Student(5,"mohit");
//
//		// accessing the elements of the specified array
//		for (int i = 0; i < arr.length; i++)
//			System.out.println("Element at " + i + " : " +
//						arr[i].roll_no +" "+ arr[i].name);
//	}
//}













//public class lecture3 {  
//    public static void main(String[] args) {  
//        //Initialize array  
//        int [] arr = new int [] {1, 2, 3, 4, 5};
//        
//        System.out.println("Original array: ");  
//        for (int i = 0; i < arr.length; i++) {  
//            System.out.print(arr[i] + " ");  
//        }  
//        System.out.println();  
//        System.out.println("Array in reverse order: ");  
//        //Loop through the array in reverse order  
//        for (int i = arr.length-1; i >= 0; i--) {  
//            System.out.print(arr[i] + " ");  
//        }  
//    }  
//}  











//public class lecture3 {  
//public static void main(String[] args) {  
//        //Initialize array  
//        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
//        System.out.println("Duplicate elements in given array: ");  
//        //Searches for duplicate element  
//        for(int i = 0; i < arr.length; i++) {  
//            for(int j = i + 1; j < arr.length; j++) {  
//                if(arr[i] == arr[j])  
//                    System.out.println(arr[j]);  
//            }  
//        }  
//    }  
//}  







//public class lecture3 {    
//    public static void main(String[] args) {        
//            
//        //Initialize array     
//        int [] arr = new int [] {5, 2, 8, 7, 1};     
//        int temp = 0;    
//            
//        //Displaying elements of original array    
//        System.out.println("Elements of original array: ");    
//        for (int i = 0; i < arr.length; i++) {     
//            System.out.print(arr[i] + " ");    
//        }    
//            
//        //Sort the array in ascending order    
//        for (int i = 0; i < arr.length; i++) {     
//            for (int j = i+1; j < arr.length; j++) {     
//               if(arr[i] > arr[j]) {    
//                   temp = arr[i];    
//                   arr[i] = arr[j];    
//                   arr[j] = temp;    
//               }     
//            }     
//        }    
//          
//        System.out.println();    
//            
//        //Displaying elements of array after sorting    
//        System.out.println("Elements of array sorted in ascending order: ");    
//        for (int i = 0; i < arr.length; i++) {     
//            System.out.print(arr[i] + " ");    
//        }    
//    }    
//}    







//public class lecture3{  
//public static int getSecondSmallest(int[] a, int total){  
//int temp;  
//for (int i = 0; i < total; i++)   
//        {  
//            for (int j = i + 1; j < total; j++)   
//            {  
//                if (a[i] > a[j])   
//                {  
//                    temp = a[i];  
//                    a[i] = a[j];  
//                    a[j] = temp;  
//                }  
//            }  
//        }  
//       return a[1];//2nd element because index starts from 0  
//}  
//public static void main(String args[]){  
//int a[]={1,2,5,6,3,2};  
//int b[]={44,66,99,77,33,22,55};  
//System.out.println("Second smallest: "+getSecondSmallest(a,6));  
//System.out.println("Second smallest: "+getSecondSmallest(b,7));  
//}} 