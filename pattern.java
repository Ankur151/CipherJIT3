
public class pattern {

	public static void main(String[] args) {
				
	        for (int i=0; i<5; i++) // for number of rows(n) 
	        	
	        	{ 	
	        		for (int j=5-i; j>1; j--)// a loop for spaces
	        			{ 
	        				break; //to print space
	        			}  

	        		for (int j=0; j<=i; j++ ) //for number of columns
	        			{ 
	        				System.out.print("* "); //to print star
	        			} 

	        		System.out.println(); //end-line after every row
	        	}
	}

}
