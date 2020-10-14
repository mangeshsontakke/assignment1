import java.util.Scanner;

public class Program05 {
	/*5. Sum of fibonacci series upto given input.
	sum of first 3 
	logic:1+1+2
	output:4 
	
	 */

	public static void main(String[] args) {
		
		int n = 3; 
        int fibo[]=new int [n+1]; 
        fibo[0] = 0; fibo[1] = 1; 
       
      
        int sum = fibo[0] + fibo[1];  //0+1  1
       
        // Add remaining terms 
        for (int i=2; i<=n; i++) 
        { 
            fibo[i] = fibo[i-1]+fibo[i-2]; 
            sum=sum+ fibo[i]; 
        } 
        System.out.println("Sum of Fibonacci numbers is : "+sum);
        
      
    
	}
	}


