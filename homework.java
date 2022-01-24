import java.util.*;

//public class homework {
//    public static void main(String args[]) {
//        
//       ArrayList<String> arraylist = new ArrayList<String>();
//    arraylist.add("Apple");
//    arraylist.add("Banana");
//    arraylist.add("Pear");
//    arraylist.add("Mango");
//
//    /*Unsorted List: ArrayList content before sorting*/
//    System.out.println("ArrayList Before Sorting:");
//    for(String str: arraylist){
//   System.out.println(str);
//  }
//
//    /* Sorting in decreasing (descending) order*/
//    Collections.sort(arraylist, Collections.reverseOrder());
//
//    /* Sorted List in reverse order*/
//    System.out.println("ArrayList in descending order:");
//    for(String str: arraylist){
//   System.out.println(str);
//    }
//  }
//}

 
 
 
 
 
 
 
 
 
 
 ////Sorting by Keys
//public class homework {
//    public static void main(String args[]) {
//        
//    // Creating a HashMap of int keys and String values
//    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
// 
//    // Adding Key and Value pairs to HashMap
//    hashmap.put(22,"A");
//    hashmap.put(55,"B");
//    hashmap.put(33,"Z");
//    hashmap.put(44,"M");
//    hashmap.put(99,"I");
//    hashmap.put(88,"X");
// 
//    System.out.println("Before Sorting:");
//    Set set = hashmap.entrySet();
//    Iterator iterator = set.iterator();
//    while(iterator.hasNext()) {
//        Map.Entry pair = (Map.Entry)iterator.next();
//        System.out.print(pair.getKey() + ": ");
//        System.out.println(pair.getValue());
//    }
//    Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);     
//		System.out.println("After Sorting:");
//    Set set2 = map.entrySet();
//    Iterator iterator2 = set2.iterator();
//    while(iterator2.hasNext()) {
//        Map.Entry pair = (Map.Entry)iterator2.next();
//        System.out.print(pair.getKey() + ": ");
//        System.out.println(pair.getValue());
//    } 
//  }
//} 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
// public class homework {
//	    public static void main(String args[]) {
//	        
//	    // Creating a HashMap of int keys and String values
//	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
//	 
//	    // Adding Key and Value pairs to HashMap
//	    hashmap.put(22,"A");
//	    hashmap.put(55,"B");
//	    hashmap.put(33,"Z");
//	    hashmap.put(44,"M");
//	    hashmap.put(99,"I");
//	    hashmap.put(88,"X");
//	 
//	    System.out.println("Before Sorting:");
//	    Set set = hashmap.entrySet();
//	    Iterator iterator = set.iterator();
//	    while(iterator.hasNext()) {
//	        Map.Entry pair = (Map.Entry)iterator.next();
//	        System.out.print(pair.getKey() + ": ");
//	        System.out.println(pair.getValue());
//	    }
//	    Map<Integer, String> map = sortByValues(hashmap); 
//	    System.out.println("After Sorting:");
//	    Set set2 = map.entrySet();
//	    Iterator iterator2 = set2.iterator();
//	      while(iterator2.hasNext()) {
//	           Map.Entry pair = (Map.Entry)iterator2.next();
//	           System.out.print(pair.getKey() + ": ");
//	           System.out.println(pair.getValue());
//	      }
//	  }
//
//	    private static HashMap sortByValues(HashMap map) { 
//	       List list = new LinkedList(map.entrySet());
//	       // Defined Custom Comparator here
//	       Collections.sort(list, new Comparator() {
//	            public int compare(Object o1, Object o2) {
//	               return ((Comparable) ((Map.Entry) (o1)).getValue())
//	                  .compareTo(((Map.Entry) (o2)).getValue());
//	            }
//	       });
//
//	       // Here I am copying the sorted list in HashMap
//	       // using LinkedHashMap to preserve the insertion order
//	       HashMap sortedHashMap = new LinkedHashMap();
//	       for (Iterator it = list.iterator(); it.hasNext();) {
//	              Map.Entry entry = (Map.Entry) it.next();
//	              sortedHashMap.put(entry.getKey(), entry.getValue());
//	       } 
//	       return sortedHashMap; 
//	  }
//	}