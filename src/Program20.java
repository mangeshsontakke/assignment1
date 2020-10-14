/*20. Get a input string. Find if it is a negative number, if true return the absolute value, in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1*/

public class Program20 {
	
	public static void main(String args[]) {
	
		String str="-123";
		
		if(str.startsWith("-"))
		{
			int temp = Integer.parseInt(str);// convert string into integer
			int realnum = Math.abs(temp);// Math.abs method return a absolute Number
			System.out.println(realnum);
		}
		else
		{
			System.out.println(-1);
		}
	}

}
