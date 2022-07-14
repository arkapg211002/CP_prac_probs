Problem
CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:

Recent Contest Problems - contains only problems from the last 2 contests
Separate Un-Attempted, Attempted, and All tabs
Problem Difficulty Rating - the Recommended dropdown menu has various difficulty ranges so that you can attempt the problems most suited to your experience
Popular Topics and Tags
Like most users, Chef didn’t know that he could add problems to a personal to-do list by clicking on the magic '+' symbol on the top-right of each problem page. But once he found out about it, he went crazy and added loads of problems to his to-do list without looking at their difficulty rating.

Chef is a beginner and should ideally try and solve only problems with difficulty rating strictly less than 10001000. Given a list of difficulty ratings for problems in the Chef’s to-do list, please help him identify how many of those problems Chef should remove from his to-do list, so that he is only left with problems of difficulty rating less than 10001000.

Input Format
The first line of input will contain a single integer TT, the number of test cases. Then the testcases follow.
Each testcase consists of 2 lines of input.
The first line of input of each test case contains a single integer, NN, which is the total number of problems that the Chef has added to his to-do list.
The second line of input of each test case contains NN space-separated integers D_1, D_2, \ldots, D_ND 
1
​
 ,D 
2
​
 ,…,D 
N
​
 , which are the difficulty ratings for each problem in the to-do list.
Output Format
For each test case, output in a single line the number of problems that Chef will have to remove so that all remaining problems have a difficulty rating strictly less than 10001000.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq N \leq 10001≤N≤1000
1 \leq D_i \leq 50001≤D 
i
​
 ≤5000
Subtasks
Subtask 1 (100 points):
Original constraints
Sample 1:
Input
Output
5
3
800 1200 900
4
999 1000 1001 1002
5
1 2 2 2 5000
5
1000 1000 1000 1000 1000
3
900 700 800
1
3
1
5
0
Explanation:
Test case 11: Among the three difficulty ratings, Chef only needs to remove the problem with difficulty rating 12001200, since it is \ge 1000≥1000. So, the answer is 11.

Test case 22: Among the four difficulty ratings, Chef needs to remove the problems with difficulty ratings of 10001000, 10011001, and 10021002, since they are \ge 1000≥1000. So, the answer is 33.

Test case 33: Among the five difficulty ratings, Chef needs to remove the problem with a difficulty rating of 50005000, since it is \ge 1000≥1000. So, the answer is 11.

Test case 44: Chef needs to remove all the five problems, since they are all rated \ge 1000≥1000. So, the answer is 55.

Test case 55: Chef does not need to remove any problem, since they are all rated \lt 1000<1000. So, the answer is 00.
