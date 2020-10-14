
public class Program17 {

	/*17.  Input a int array. 
	 * Square the elements in even position 
	 * and cube the elements in odd position and add them as result.
		input: {1,2,3,4}
		output: 1^3+2^2+3^3+4^2
	 */
	public static void main(String[] args) {
		
		int[]array={1,2,3,4};
		String temp[]=null;
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<array.length;i++)
		{
			if(array[i]%2==0)// for Even Position
			{
				sb.append(array[i] + "^2").append("+");//2^2+4^2+
			}else{
				sb.append(array[i] + "^3").append("+");//1^3+3^3+  .Xor oprator^
			}
			}
		System.out.println(sb.delete(sb.length()-1, sb.length()));//1^3+2^2+3^3+4^2
	}

}


