

/*18.  Check whether a given string is palindrome also check whether it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)*/

// *Palindrome is same word with reverse

public class Program18 {
	
	public static void main(String args[])
    {
        String a ="saas";
        String  b = "";
        String temp = "";
        int count =0;
        
      
        System.out.println(a);
        
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
        
        for(int i=0 ; i<b.length();i++)
		{
		if(b.charAt(i)=='a' || b.charAt(i)=='A' || b.charAt(i)=='e' || b.charAt(i)=='E' || b.charAt(i)=='i' || b.charAt(i)=='I' || b.charAt(i)=='o' || b.charAt(i)=='O' || b.charAt(i)=='u' || b.charAt(i)=='U')
			
		{		
			count++;
				
		}
		
		}
		System.out.println("Vowels are: "+count);
	 

    }
	
}
