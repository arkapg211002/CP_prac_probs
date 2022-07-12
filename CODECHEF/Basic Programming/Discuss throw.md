Problem
In discus throw, a player is given 33 throws and the throw with the longest distance is regarded as their final score.

You are given the distances for all 33 throws of a player. Determine the final score of the player.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers A, B,A,B, and CC denoting the distances in each throw.
Output Format
For each test case, output the final score of the player.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq A,B,C \leq 1001≤A,B,C≤100
Sample 1:
Input
Output
3
10 15 8
32 32 32
82 45 54
15
32
82
Explanation:
Test Case 11: The longest distance is achieved in the second throw, which is equal to 1515 units. Thus, the answer is 1515.

Test Case 22: In all throws, the distance is 3232 units. Thus, the final score is 3232.

Test Case 33: The longest distance is achieved in the first throw which is equal to 8282 units. Thus, the answer is 8282.

# SOLUTION

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
		try {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int a[][]=new int[n][3];
		    int i;
		    for(i=0;i<n;i++)
		    {
		        for(int j=0;j<3;j++)
		        {
		            a[i][j]=sc.nextInt();
		        }
		        System.out.println();
		    }
		    for(i=0;i<n;i++)
		    {
		        System.out.println((int)Math.max(a[i][0],Math.max(a[i][1],a[i][2])));
		    }
		    
		} catch(Exception e) 
		{
		    return;
		    
		}
	}
}
