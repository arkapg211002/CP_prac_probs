Problem
Chef has an array AA of length NN.

In one operation, Chef can choose any two distinct indices i, ji,j (1 \leq i, j \leq N, i \neq j)(1≤i,j≤N,i=j) and either change A_iA 
i
​
  to A_jA 
j
​
  or change A_jA 
j
​
  to A_iA 
i
​
 .

Find the minimum number of operations required to make all the elements of the array equal.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
First line of each test case consists of an integer NN - denoting the size of array AA.
Second line of each test case consists of NN space-separated integers A_1, A_2, \dots, A_NA 
1
​
 ,A 
2
​
 ,…,A 
N
​
  - denoting the array AA.
Output Format
For each test case, output the minimum number of operations required to make all the elements equal.

Constraints
1 \leq T \leq 1001≤T≤100
2 \leq N \leq 10002≤N≤1000
1 \leq A_i \leq 10001≤A 
i
​
 ≤1000
Sample 1:
Input
Output
4
3
1 2 3
4
5 5 5 5
4
2 2 1 1
3
1 1 2
2
0
2
1
Explanation:
Test Case 11: You can make all the elements equal in 22 operations. In the first operation, you can choose indices 1, 21,2 and convert A_1A 
1
​
  to A_2A 
2
​
 . So the array becomes [2, 2, 3][2,2,3]. Now you can choose indices 1, 31,3 and convert A_3A 
3
​
  to A_1A 
1
​
 , so the final array becomes [2, 2, 2][2,2,2].

Test Case 22: Since all the elements are already equal there is no need to perform any operation.

Test Case 33: You can make all the elements equal in 22 operations. In the first operation, you can choose indices 1, 31,3 and convert A_1A 
1
​
  to A_3A 
3
​
 . So the array becomes [1, 2, 1, 1][1,2,1,1]. Now you can choose indices 1, 21,2 and convert A_2A 
2
​
  to A_1A 
1
​
 , so the final array becomes [1, 1, 1, 1][1,1,1,1].

Test Case 44: You can make all the elements equal in 11 operation. You can pick indices 2, 32,3 and convert A_3A 
3
​
  to A_2A 
2
​
  after which the array becomes [1, 1, 1][1,1,1].
