import java.util.*;

//public class Lecture6 {
//	public static void main(String args[]){  
//		ArrayList<String> list=new ArrayList<>();//Creating arraylist  
//		list.add("Ananya");//Adding object in arraylist  
//		list.add("Tej");  
//		list.add("Dimple");  
//		list.add("Naman");  
//		list.set(1, "Ankur");
//		list.remove(3);
//		//Traversing list through Iterator  
//		Iterator itr=list.iterator();  
//		while(itr.hasNext()){  
//			System.out.println(itr.next());  
//		}  
//	}  
//}


















//public class Lecture6{  
//	public static void main(String args[]){  
//		LinkedList<String> al=new LinkedList<String>();  
//		al.add("Rounak");  
//		al.add("Komal");  
//		al.add("Anmol");  
//		al.add("Neeti"); 
//		al.remove();
////		al.clear();
////		System.out.println(al.get(2));
//		Iterator<String> itr=al.iterator();  
//		while(itr.hasNext()){  
//			System.out.println(itr.next());  
//		}  
//	}  
//}  











////Stack
//
//public class Lecture6{  
//	public static void main(String args[]){  
//			Stack<String> stack = new Stack<String>();  
//			stack.push("Ayush");  
//			stack.push("Garvit");  
//			stack.pop();
//			stack.push("Amit");  
//			stack.push("Ashish");  
//			stack.push("Garima");  
//			stack.pop(); 
////			System.out.println(stack.capacity());
//			Iterator<String> itr=stack.iterator();  
//			while(itr.hasNext()){  
//				System.out.println(itr.next());  
//			}  
//	}  
//}









////Priority Queue
//public class Lecture6{  
//	public static void main(String args[]){  
//		PriorityQueue<String> queue=new PriorityQueue<String>();  
//		queue.add("Amit Sharma");  
//		queue.add("Vijay Raj");  
//		queue.add("JaiShankar");  
//		queue.add("Raj");  
//		
//		  
//		System.out.println("head:"+queue.peek());  
//		System.out.println("iterating the queue elements:");  
//		
//		Iterator itr=queue.iterator();  
//		while(itr.hasNext()){  
//			System.out.println(itr.next());  
//		}  
//		queue.remove();
//		System.out.println("head after 1st remove:"+queue.element());
//		queue.poll();  
//		System.out.println("head after 2nd remove:"+queue.element());
//		System.out.println("after removing two elements:");  
//		Iterator<String> itr2=queue.iterator();  
//		while(itr2.hasNext()){  
//			System.out.println(itr2.next());  
//		}  
//	}  
//}  













////ArrayDeque
//  
//public class Lecture6{  
//	// Java program to demonstrate the working
//	// of a Deque in Java
//		public static void main(String[] args)
//		{
//			Deque<String> deque	= new ArrayDeque<String>();
//
//			// We can add elements to the queue
//			// in various ways
//
//			// Add at the last
//			deque.add("Element 1 (Tail)");
//
//			// Add at the first
//			deque.addFirst("Element 2 (Head)");
//
//			// Add at the last
//			deque.addLast("Element 3 (Tail)");
//
//			// Add at the first
//			deque.push("Element 4 (Head)");
//
//			// Add at the last
//			deque.offer("Element 5 (Tail)");
//
//			// Add at the first
//			deque.offerFirst("Element 6 (Head)");
//
//			System.out.println(deque + "\n");
//
//			// We can remove the first element
//			// or the last element.
//			deque.removeFirst();
//			deque.removeLast();
//			
//			System.out.println("Deque after removing "
//							+ "first and last: "
//							+ deque);
//		}
//	
//}  