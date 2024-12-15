// Implement atoi and itoa functions bookmark_border
// Implement the below functions with recursion from string library as your own functions.

// 1. itoa() function converts int data type to string data type.
// 2. atoi() function converts string data type to int data type.
// Input Format:

// The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains a string str and a number num. 
// Function void itoa(int num, char* result) will take the number as parameter and place the string from this number in array result.
// Function int atoi(char *str) will take the string as parameter and return the string as an integer value.
// Output Format:

// For each test case, print the output of itoa() and atoi() in new lines.
// ﻿Sample Input

// 1
// "100" 135
// Sample Output

// 100 "135"

class Result {
    static String itoa(int num) {
      // Write your code here
          StringBuilder ans = new StringBuilder();
          //int n=0;
        if(num == 0){
            return "0";
        }
        boolean neg = false;
        if(num < 0){
            neg = true;
            num = -num;
        }
        while(num > 0){
            int rem = num%10;
            ans.append((char)(rem + '0'));
            num/=10;
        }
        if(neg){
            ans.append('-');
        }
        return ans.reverse().toString().trim();
    }
  
    static int atoi(String str) {
      // Write your code here
        int ans = 0;
        for(char ch:str.toCharArray()){
            ans = ans * 10 + (int)(ch - '0');
        }
        return ans;
      //return 0;
    }
  }