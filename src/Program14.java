

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program14 {
	/*14.  Find the extension of a given string file.
		input: "hello.jpeg"
		output: "jpeg"
	 *///split 

	public static void main(String[] args) {
		
		/*String f;
		String extesion;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The FIle Name with Extension : ");
		f=sc.next();
		int index;
		index = f.indexOf(".");//focus on .
		extesion = f.substring(index+1);// print after '.'// hello./jpg
		System.out.println("OutPut "+extesion);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The FIle Name with Extension : ");
		String textfile=sc.next();
		
	/*	String filename=textfile.split("\\.")[0];
		String extension=textfile.split("\\.")[1];
		System.out.println("OutPut: "+extension);*/
	
	   StringTokenizer t = new StringTokenizer(textfile,".");// StringTokenizer is used for split the string into single token
	    String s2 = t.nextToken();
	    String s3 = t.nextToken();
	    System.out.println("OutPut: "+s3);
		
		
		

	}

}
