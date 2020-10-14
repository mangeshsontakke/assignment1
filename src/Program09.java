	
	public class Program09 {
		
		/*9. find the max length-word in a given string and 
		 * return the max-length word. 
		 * if two words are of same length 
		 * return the first occuring word of max-length
			input:"hello how are you aaaaa"
			output:hello(length-5)
		 */
		
	public static void main(String[] args) {
			
		String str = ("hello how are you aaaaa");
		String words[]= str.split(" "); // array string to save whole string in space format
		int max = 0;
		String temp = null;	
		int len = 0;
		for(int i=0;i<words.length;i++){
			int size = words[i].length(); //to find length of word
			if(max<size){ //true,false
				temp=words[i];// hello
				len=temp.length();//5
				max=len; //5
				
			}
		}
		
	System.out.println("Max string is - " + temp + " and length is - " + len);
			
	
	}

}
