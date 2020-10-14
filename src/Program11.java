
public class Program11 {
	/*11. Two input strings are accepted. 
	 * If the two strings are of same length concat them and return, 
	 * if they are not of same length, 
	 * reduce the longer string to size of smaller one, and concat them
		input1:"hello"
		input2:"hi" 
		output:"lohi"
		input1:"aaa"
		input2:"bbb"
		output:"aaabbb"
	 */
public static void main(String[] args) {
	
	String n = "aaa";
	String j = "bbb";
	String ans = "";
	
	if(n.length()==j.length()) //false
	{
		ans = n.concat(j);
	}
	else if(n.length()>j.length())//true
	{
		String temp = n.substring(j.length()+1,n.length());//lo 3,5
		ans = temp.concat(j);//lo+hi =lohi
	}
	else
	{
		String d = j.substring(n.length()+1,j.length());
		ans = d.concat(n);
	}
	System.out.println(ans);
		
	}

}
