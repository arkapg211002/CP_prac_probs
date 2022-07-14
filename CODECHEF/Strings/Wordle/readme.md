Problem
Chef invented a modified wordle.

There is a hidden word SS and a guess word TT, both of length 55.

Chef defines a string MM to determine the correctness of the guess word. For the i^{th}i 
th
  index:

If the guess at the i^{th}i 
th
  index is correct, the i^{th}i 
th
  character of MM is \texttt{G}G.
If the guess at the i^{th}i 
th
  index is wrong, the i^{th}i 
th
  character of MM is \texttt{B}B.
Given the hidden word SS and guess TT, determine string MM.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of two lines of input.
First line contains the string SS - the hidden word.
Second line contains the string TT - the guess word.
Output Format
For each test case, print the value of string MM.

You may print each character of the string in uppercase or lowercase (for example, the strings \texttt{BgBgB}BgBgB, \texttt{BGBGB}BGBGB, \texttt{bgbGB}bgbGB and \texttt{bgbgb}bgbgb will all be treated as identical).

Constraints
1 \leq T \leq 10001≤T≤1000
|S| = |T| = 5∣S∣=∣T∣=5
S, TS,T contain uppercase english alphabets only.
Sample 1:
Input
Output
3
ABCDE
EDCBA
ROUND
RINGS
START
STUNT
BBGBB
GBBBB
GGBBG
Explanation:
Test Case 11: Given string S = \texttt{ABCDE}S=ABCDE and T = \texttt{EDCBA}T=EDCBA. The string MM is:

Comparing the first indices, \texttt{A} \neq \texttt{E}A=E, thus, M[1] = \texttt{B}M[1]=B.
Comparing the second indices, \texttt{B} \neq \texttt{D}B=D, thus, M[2] = \texttt{B}M[2]=B.
Comparing the third indices, \texttt{C} = \texttt{C}C=C, thus, M[3] = \texttt{G}M[3]=G.
Comparing the fourth indices, \texttt{D} \neq \texttt{B}D=B, thus, M[4] = \texttt{B}M[4]=B.
Comparing the fifth indices, \texttt{E} \neq \texttt{A}E=A, thus, M[5] = \texttt{B}M[5]=B.
Thus, M = \texttt{BBGBB}M=BBGBB.
Test Case 22: Given string S = \texttt{ROUND}S=ROUND and T = \texttt{RINGS}T=RINGS. The string MM is:

Comparing the first indices, \texttt{R} = \texttt{R}R=R, thus, M[1] = \texttt{G}M[1]=G.
Comparing the second indices, \texttt{O} \neq \texttt{I}O=I, thus, M[2] = \texttt{B}M[2]=B.
Comparing the third indices, \texttt{U} \neq \texttt{N}U=N, thus, M[3] = \texttt{B}M[3]=B.
Comparing the fourth indices, \texttt{N} \neq \texttt{G}N=G, thus, M[4] = \texttt{B}M[4]=B.
Comparing the fifth indices, \texttt{D} \neq \texttt{S}D=S, thus, M[5] = \texttt{B}M[5]=B.
Thus, M = \texttt{GBBBB}M=GBBBB.
