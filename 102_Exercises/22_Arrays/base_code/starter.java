/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int x=0;
			 int[] arr = new int[1001];
			 int[] arr2 = new int[1001];
			
			
			while(x<1000){
				arr[x] = x*3;
				
				x=x+1;
			}
			x=0;
			while(x<1000){
				System.out.print((arr[x])+", ");
				x=x+1;
			}
			x=0;
			while(x<1000){
				arr2[x]=1000-x;
				x=x+1;
			}
			x=0;
			while(x<1000){
				System.out.print(arr2[x]+", ");
				x=x+1;
			}

	}
}
