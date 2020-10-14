
public class Program3 {
	
	/*3.A integer array is given as input.
	 * find the difference between each element.
	 * Return the index of the largest element which has the largest difference gap.
	input: {2,3,4,2,3}
	logic: 2-3=1,3-4=1,4-2=2,2-3=1	 */
	
	public static void main(String[] args) {
		
		int arr[]={2,3,4,2,3};
			int max = 0,location = 0 ; 
		for(int i=0;i<arr.length-1;i++)
		{
			int result = arr[i] - arr[i+1]; // i position - i+1 Position (2-3=1,3-4=1,4-2=2,2-3=1)
			
			if(max<result)//true, max is less than result, find the index element which is greater
			{
				max = result;// store greater element into temp = 1,2
				location = i;// find exact index or location of greater element 0,2
			}
		}System.out.println(location);
		
		}
	
	}
