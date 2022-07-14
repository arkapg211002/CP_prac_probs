Problem
Most programmers will tell you that one of the ways to improve your performance in competitive programming is to practice a lot of problems.

Our Chef took the above advice very seriously and decided to set a target for himself.

Chef decides to solve at least 1010 problems every week for 44 weeks.
Given the number of problems he actually solved in each week over 44 weeks as P_1, P_2, P_3,P 
1
​
 ,P 
2
​
 ,P 
3
​
 , and P_4P 
4
​
 , output the number of weeks in which Chef met his target.

Input Format
There is a single line of input, with 44 integers P_1, P_2, P_3,P 
1
​
 ,P 
2
​
 ,P 
3
​
 , and P_4P 
4
​
 . These are the number of problems solved by Chef in each of the 44 weeks.

Output Format
Output a single integer in a single line - the number of weeks in which Chef solved at least 1010 problems.

Constraints
1 \leq P_1, P_2, P_3, P_4 \leq 1001≤P 
1
​
 ,P 
2
​
 ,P 
3
​
 ,P 
4
​
 ≤100
Sample 1:
Input
Output
12 15 8 10
3
Explanation:
Chef solved at least 1010 problems in the first, second and fourth weeks. He failed to solve at least 1010 problems in the third week. Hence, the number of weeks in which Chef met his target is 33.

Sample 2:
Input
Output
2 3 1 10
1
Explanation:
Chef solved at least 1010 problems in the fourth week. He failed to solve at least 1010 problems in all the other three weeks. Hence, the number of weeks in which Chef met his target is 11.

Sample 3:
Input
Output
12 100 99 11
4
Explanation:
Chef solved at least 1010 problems in all the four weeks. Hence, the number of weeks in which Chef met his target is 44.

Sample 4:
Input
Output
1 1 1 1
0
Explanation:
Chef was not able to solve at least 1010 problems in any of the four weeks. Hence, the number of weeks in which Chef met his target is 00
