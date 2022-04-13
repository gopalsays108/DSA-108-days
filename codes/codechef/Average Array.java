// https://www.codechef.com/problems/AVGARR 
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		while(tc --> 0){
		     String[] inp = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inp[0]);           
            int x = Integer.parseInt(inp[1]);

            for(int i = 1; i<= n/2;i++){
            	System.out.print((x+i )+ " " + (x-i) + " ");
            }

            if((n&1) == 1){
            	System.out.println(x + " ");
            }    
		}
	}
}
