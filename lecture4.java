
//public class lecture4 {
//		  
//		    static int factorial(int n){      
//		          if (n == 1)      
//		            return 1;      
//		          else      
//		            return(n * factorial(n-1));      
//		    }      
//		  
//		public static void main(String[] args) {  
//		System.out.println("Factorial of 5 is: "+factorial(5));  
//		}  
//		
//}







//Fibo Series
//public class lecture4 {  
//    static int n1=0,n2=1,n3=0;      
//      static void printFibo(int count){      
//        if(count>0){      
//             n3 = n1 + n2;      
//             n1 = n2;      
//             n2 = n3;      
//             System.out.print(" "+n3);     
//             printFibo(count-1);      
//         }      
//     }     
//	
//	static{
//		System.out.println("Hello");
//	}
//	
//public static void main(String[] args) {  
//    int count=15;
//    System.out.println(count);
//    lecture4 l = new lecture4();
    
//      System.out.print(n1+" "+n2);//printing 0 and 1      
//      printFibo(count-2);//n-2 because 2 numbers are already printed     
//}  
//
//}  


public class lecture4 {
	public static void main(String[] args) {
		
		String str1 = "abcdABCDabcdABCD";
		
		str1 = str1.replace("a", ""); 

		System.out.println(str1); // bcdABCDbcdABCD

	}
}






