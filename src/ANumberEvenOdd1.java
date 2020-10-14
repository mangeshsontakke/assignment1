import java.util.Scanner;
import java.util.*; 
/* 1. A number is given as input. Find the odd digits in the number, add them and find if the sum is odd or not.if even return -1, if odd return 1
input:52315
logic:5+3+1+5=14(even)
output:-1

input:1112
logic:1+1+1=3(odd)
output:1
 */
	class ANumberEvenOdd1 { 
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Number:");//52315
				int no = sc.nextInt();
				int add=0;// to add number
				while(no!=0) {// no=52315 / 5231 /523 / 52 / 5
					int rem = no % 10;//5,1,3
					
					if(rem%2!=0) {// 5%2!==0 True
						add=add+rem;//5 + 1 + 3 + 5 = 14
					}
					no = no/10;// remind = 5231--> last 5 is skip -->no=52315 / 5231 /523 / 5(2)  skip because 2/10=5 / 5
				}
				if(add%2==0) {// 14 (Even) return -1 
					System.out.println("-1");
					
				}else {
					System.out.println("1");
				}
				
			}

		}

