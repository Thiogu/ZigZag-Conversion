# ZigZag-Conversion
leetcode medium


The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


How i solved this:
do a for loop from 1 to numrow
e:g 4 rows: put character from string in row 1,2,3,4

then do another for -loop from numrow-1 to numrow-numrow+1
e.g 4 rows: put character from string in row 3,2

I previously did 3,2,1 but that will cause a repeat in row 1 consecutively. Hope this helps!
