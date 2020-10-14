import java.util.Scanner;
public class Program13 {
	// Scanner 
/*13. Get a integer array as input. 
  Find the average of the elements which are in the position 
  of prime index
	output:21
	input:{1,2,3,4,5,6,7,8,9,10}
       0,1,2,3,4,5,6,7,8,9
logic:3+4+6+8(the index are prime numbers)
 */

		  public static void main(String[] args) {
			 // int arr[] = {1,2,3,4,5,6,7,8,9,10};
				int sum = 0;
				 //prime numbers are 2,3,5,7 out of 10
				
				
				int n;
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter no. of elements you want in array:");
		        n = sc.nextInt();
		        int arr[] = new int[n];
		        System.out.println("Enter all the elements:");
		        for(int i = 0; i < n; i++)
		        {
		            arr[i] = sc.nextInt();
		           
		        }
			
				for(int i=2; i<arr.length; i++)// array traverse 2 to 9
				{
				int count = 0;
				for(int j=2; j<i; j++)//array traverse 2 to i th position
					{
						if(i%j == 0)
						{
							count++;// if not prime then count is ++ other wise not
						}
					}
					if(count == 0)// if condition is true then its prime no.
					{
						sum = sum + arr[i];//index 2,3,5,7... 3+4+6+8=21
					}
					
				}System.out.println(sum);// 21
	}

}
