// Check if strings are rotations or not bookmark_border
// Given two strings, find whether both are rotations of each other or not. For example,

// Given str1 = abacd and str2 = acdab, we can get str1 by rotating str2 and,

// Given str1 = coder and str2 = cored, we can not get str1 by rotating str2.

// ﻿Input Format

// The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two strings str1 and str2. 
// Output Format

// For each test case, print YES or NO in new lines.
// Sample Input

// 2  // Test Cases
// abacd  // testcase 1
// acdab
// coder  // testcase 2
// cored
// Sample Output

// YES
// NO

class Result {
    // return 1 for YES and 0 for NO.
    static int isRotation(String str1, String str2) {
      // Write your code here
        if(str1.length() != str2.length()){
            return 0;
        }
      String concat = str1 + str1;
      if(concat.contains(str2)){
          return 1;
      }
        return 0;
    }
  }