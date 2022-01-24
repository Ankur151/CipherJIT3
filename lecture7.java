import java.util.*;


////Map interface/HashMap Example example
//public class lecture7 {
//
//	
//	 public static void main(String args[]){  
//	  HashMap<Integer,String> map=new HashMap<Integer,String>();  
//	  map.put(100,"Amit");  
//	  map.put(101,"Vijay");  
//	  map.put(102,"Amit");  
//	  
//	  map.put(101,"Shweta"); //trying duplicate key  
//	  
////	  System.out.println(map.get(100));
////	  map.remove(100);
//	  
//	  for(Map.Entry m:map.entrySet()){  
//	   System.out.println(m.getKey()+" "+m.getValue());  
//	  }  
//	 }  
//}
















////Practice question 1
//public class lecture7 
//{    
//    public static void main(String[] args) 
//    {
//        //Creating the HashMap
//         
//        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
//         
//        //Adding key-value pairs to HashMap
//         
//        map.put(1, 1.1);
//         
//        map.put(2, 2.2);
//         
//        map.put(3, 3.3);
//         
//        map.put(4, 4.4);
//         
//        //Checking whether key '3' exist in map
//         
//        System.out.println(map.containsKey(3));      //Output : true
//         
//        //Checking whether value '3.3' exist in map
//         
//        System.out.println(map.containsValue(3.3));   //Output : true
//    }   
//}














////Java Program Demonstrating Operations on the Set
////such as Union, Intersection and Difference operations
////Main class
//public class lecture7 {
//
//	// Main driver method
//	public static void main(String args[])
//	{
//		// Creating an object of Set class
//		// Declaring object of Integer type
//		Set<Integer> a = new HashSet<Integer>();
//	
//		// Adding all elements to List
//		a.addAll(Arrays.asList(
//			new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
//	
//	// Again declaring object of Set class
//	// with reference to HashSet
//		Set<Integer> b = new HashSet<Integer>();
//		
//	b.addAll(Arrays.asList(
//			new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
//
//		
//		// To find union
//		Set<Integer> union = new HashSet<Integer>(a);
//		union.addAll(b);
//		System.out.print("Union of the two Set");
//		System.out.println(union);
//
//		// To find intersection
//		Set<Integer> intersection = new HashSet<Integer>(a);
//		intersection.retainAll(b);
//		System.out.print("Intersection of the two Set");
//		System.out.println(intersection);
//
//		// To find the symmetric difference
//		Set<Integer> difference = new HashSet<Integer>(a);
//		difference.removeAll(b);
//		System.out.print("Difference of the two Set");
//		System.out.println(difference);
//	}
//}

















////Java program Demonstrating Creation of Set object
////Using the Hashset class
////Main class
//class lecture7 {
//
//	// Main driver method
//	public static void main(String[] args)
//	{
//		// Creating object of Set of type String
//		Set<String> h = new HashSet<String>();
//
//		// Adding elements into the HashSet
//		// using add() method
//
//		// Custom input elements
//		h.add("India");
//		h.add("South Africa");
//		h.add("Australia");
//		
//
//		// Adding the duplicate element
////		h.add("India");
//
//		// Displaying the HashSet
//		System.out.println(h);
//
//		// Removing items from HashSet
//		// using remove() method
////		h.remove("Australia");
////		System.out.println("Set after removing "
////						+ "Australia:" + h);
//
//		// Iterating over hash set items
//		System.out.println("Iterating over set:");
//
//		// Iterating through iterators
//		Iterator<String> i = h.iterator();
//
//
//		
//		// It holds true till there is a single element
//		// remaining in the object
//		while (i.hasNext())
//
//			System.out.println(i.next());
//	}
//	
//}



















////HashSet to Array
//public class lecture7 {
//    public static void main(String args[]) {
//        
//    // Declaring a HashSet
//    HashSet<String> hashset = new HashSet<String>();
//    // Add elements to HashSet
//    hashset.add("Pear");
//    hashset.add("Apple");
//    hashset.add("Orange");
//    hashset.add("Papaya");
//    hashset.add("Banana");
//    //Showing HashSet elements
//    System.out.println("HashSet contains :" + hashset);
//    // Creating an Array of HashSet size
//    String[] array = new String[hashset.size()];
//    // Converting HashSet to Array using toArray() method
//    hashset.toArray(array);
//    //Showing Array elements
//    System.out.println("Array contains :");
//    for(String str : array){
//        System.out.println(str);
//    }
//  }
// }
