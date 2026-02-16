import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        while (T-- > 0){
            String s = sc.nextLine();
            
            if (islapindrome(s)){
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
	}
	
	public static boolean islapindrome(String s){
	    
	    String left, right;
	    
	    int n = s.length();
	    
	    if (n % 2 == 0){
	        left = s.substring(0, n / 2);
	        right = s.substring(n / 2);
	    }
	    
	    else{
	        left = s.substring(0,n / 2);
	        right = s.substring(n/2 + 1);
	    }
	    
	    
	    int[] countLeft = new int[26];
	    int[] countRight = new int[26];
	    
	    for(char c : left.toCharArray()){
	        
	        countLeft[c - 'a']++;
	    }
	    
	    for (char c : right.toCharArray()){
	        
	        countRight[c - 'a']++;
	    }
	    
	    return Arrays.equals(countRight, countLeft);
	    
	}
	
	
}
