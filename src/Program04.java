import java.util.Arrays;

public class Program04 {
	
			/*4.Given two arrayslist.retrieve the odd position elements form
			 * first input and even position elemetns from second list. 
			put it into the new arraylist at the same positions from 
			where they are retrieved from.
			(consider 0th position as even position,
			and two lists are of same size)
			input1:{12,1,32,3}
			input2:{0,12,2,23}
			output:{0,1,2,3} //odd even position 
			 */

	public static void main(String[] args) {
		int[] arr1={12,1,32,3};
		int[] arr2={0,12,2,23};
		int  len1=arr1.length;
		int temp[]= new int[len1];// temp is for storing result
	
		for(int i=0;i<arr1.length;i++)
		{
			if(i % 2 == 0){ 
			temp[i] = arr2[i]; //0,2
			
			}else{
				temp[i]=arr1[i]; //1,3
			}
		}
			
		System.out.println(Arrays.toString(temp)); // to print result as per given format it convert integer into string just for formatting as per result

	}
	
}
