

public class Program16 {
	/*16. Find if a given pattern appears in both the input strings 
	 * at same postions.
			input1: "hh--ww--"
			input2: "rt--er--"
			output: true(false otherwise)
	 * 
	 */
	
public static void main(String[] args) {
	  String str1 = "bd--ab--";
      String str2 = "ha---wa--";
      
	String s1 = str1.replaceAll("[a-zA-Z]+", "");//""-> space or null
	String s2 = str2.replaceAll("[a-zA-Z]+", "");
	
		if(s1.equalsIgnoreCase(s2))//avoid case sensitive only check char
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}


	}

}
