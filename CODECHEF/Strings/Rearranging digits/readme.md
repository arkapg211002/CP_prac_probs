Problem
Given a positive integer NN, MoEngage wants you to determine if it is possible to rearrange the digits of NN (in decimal representation) and obtain a multiple of 55.

For example, when N = 108N=108, we can rearrange its digits to construct 180 = 36 \cdot 5180=36⋅5 which is a multiple of 55.

Input Format
The first line contains an integer TT, the number of test cases. The description of the TT test cases follow.
Each test case consists of two lines
The first line contains a single integer DD, the number of digits in NN.
The second line consists of a string of length DD, the number NN (in decimal representation). It is guaranteed that the string does not contain leading zeroes and consists only of the characters 0, 1, \dots 90,1,…9.
Output Format
For each test case, print \texttt{Yes}Yes if it is possible to rearrange the digits of NN so that it becomes a multiple 55. Otherwise, print \texttt{No}No.
You may print each character of the string in uppercase or lowercase (for example, the strings \texttt{YeS}YeS, \texttt{yEs}yEs, \texttt{yes}yes and \texttt{YES}YES will all be treated as identical).

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq D \leq 10001≤D≤1000
1 \leq N \lt 10^{1000}1≤N<10 
1000
 
Sum of DD over all test cases \leq 1000≤1000.
Sample 1:
Input
Output
3
3
115
3
103
3
119
Yes
Yes
No
Explanation:
Test Case 11: The given number is already divisible by 55, therefore the answer is \texttt{Yes}Yes.

Test Case 2: We can obtain 310 = 62 \cdot 5310=62⋅5 by rearranging the digits of 103103, so the answer is \texttt{Yes}Yes.

Test Case 3: The only numbers that can be obtained by rearranging the digits of 119119 are \{119, 191, 911\}{119,191,911}. None of these numbers are multiples of 55, so the answer is \texttt{No}No.
