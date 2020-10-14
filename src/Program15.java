
public class Program15 {

	public static void main(String[] args) {
		/*15. Get two integer arrays as input.
		 * Find if there are common elements in the arrays.
		 * find the number of common elements.
			input1: {1,2,3,4}
			input2: {3,4,5,6}
			output: 4(3,4,3,4)
		 */
		int arr1[] = {1,2,3,4};	
		int arr2[] = {3,4,5,6};
		int ans[]=new int[4];
		String value="";
		int cnt = 0;//for how many times duplicate value 
		for(int i=0; i<arr1.length; i++)//arr1
		{
			for(int j=0; j<arr2.length; j++)//arr2
			{
				if(arr1[i]==arr2[j])
				{
					ans[cnt]=arr1[i];//3,4
					cnt=cnt+1;//1,2
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr1.length; j++)
			{
				if(arr2[i]==arr1[j])
				{
					ans[cnt]=arr2[i];//3,4 
					cnt=cnt+1;//3,4 = 4
				}
			}
		}

		
		
		for(int j=0; j<ans.length; j++)// Ans = 3 4 3 4 = 4
		{
			if(value=="")//check empty
			{
				value= value + ans[j];//3 
			}else
			{
				value= value +","+ ans[j] ;// 3,4,3,4
			}
		}
		System.out.println("OutPut: "+ cnt + "{"+ value +"}");//OutPut: 4{3,4,3,4}
		

	}

}
