//import java.util.*;
//public class advance
//{
//    static int find(int n1, int n2) {
//        int count = 0;
//        for (int i = n1 ; i <= n2 ; i++) {
//            int num = i;
//
//            boolean[] visited = new boolean[10];
//
//            while (num > 0) {
//                if (visited[num % 10] == true)
//                    break;
//                visited[num % 10] = true;
//                num /= 10;
//            }
//
//            if (num == 0)
//                count++;
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int n1 = 101, n2 = 200;
//        System.out.println(find(n1, n2));
//    }
//}












//class advance 
//{
//  
//    public static boolean isPalindrome (String s) 
//    {
//        
//        if (s.length () == 1)
//            return true;
//        StringBuilder sb = new StringBuilder (s);
//        sb = sb.reverse ();
//        String rev = new String (sb);
//        return s.equals (rev);
//    }
//  
//    public static void main (String[]args) 
//    {
//        Scanner sc = new Scanner (System.in);
//        String str = sc.next ();
//    
//        int len = str.length ();
//        String str1 = "", str2 = "", str3 = "";
//
//        boolean flag = false;
//    
//        for (int i = 1; i < len - 1; i++)
//        {
//	
//            str1 = str.substring (0, i);
//            if (isPalindrome (str1))
//        	{
//                for (int j = 1; j < len - i; j++)
//        	    {
//		            str2 = str.substring (i, i + j);
//                    str3 = str.substring (i + j, len);
//                    if (isPalindrome (str2) && isPalindrome (str3))
//            		{
//                        System.out.println (str1 + "\n" + str2 + "\n" + str3);
//                        flag = true;
//                        break;
//                    }
//                }
//                if (flag)
//                    break;
//            }
//        }
//        if (flag == false)
//            System.out.println ("Impossible");
//    }
//}























//class advance 
//{
//    public static int evenSum (int m, int n, int k, int N) 
//    {
//    
//        if (k == 1)
//            return n;
//        else
//            return (N - (m - n) * evenSum (m, n, k - 1, n) % (1000000007));
//    }
//  
//    public static void main (String[]args) 
//    {
//        Scanner sc = new Scanner (System.in);
//        int low = sc.nextInt ();
//        int high = sc.nextInt ();
//        int k = sc.nextInt ();
//        int diff = high - low + 1;
//        int out, n, N, m;
//    
//        if (diff % 2 == 0)
//        {
//            m = diff / 2;
//            n = m;
//        }
//        else
//        {
//	    
//            if (low % 2 == 0)
//    	    {
//                m = (diff - 1) / 2;
//                n = m + 1;
//            }
//        	else
//    	    {
//                m = (diff + 1) / 2;
//                n = m - 1;
//            }
//        }
//        N = m;
//        for (int i = 0; i < k - 1; i++)
//            N = (N * (m + n)) % 1000000007;
//        out = evenSum (m, n, k, N) % 1000000007;
//        System.out.println (out);
//    } 
//}


















//public class advance
//{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int testcases = scanner.nextInt();
//        int tables = 0,people;
//        while (testcases-->0)
//            tables = scanner.nextInt();
//            people = scanner.nextInt();
//            System.out.println(find(tables,people));
//    }
//    public static int find(int r,int n)
//    {
//        int x = n/r;
//        int y1 = n%r;
//        int x1 = 0;
//        int ans1 = 1;
//        while(r!=0)
//        {
//            if(y1>0)
//            {
//                x1 = x+1;
//                y1 = y1-1;
//            }
//            else
//            {
//                x1 = x;
//            }
//            ans1 = ans1*combination(n,x1);
//            n = n-x1;
//            r--;
//        }
//        return ans1;
//    }
//    public static int factorial(int n)
//    {
//        if(n==0||n==1)
//        {
//            return 1;
//        }
//        return n * factorial(n-1);
//    }
//    public static int combination(int n,int r)
//    {
//        return factorial(n)/(factorial(n-r)*factorial(r));
//    }
//}