// Implement strcat function bookmark_border
// Implement the strcat() function from string library as your own function. The function will take two strings as arguments and concatenate the second string at the end of first string.

// Input Format:

// The first line of input contains an integer T denoting the no of test cases . 
// Then T test cases follow. Each test case contains two strings str2 and str1. 
// Function strcatCode(str1,str2) will take two parameters and concatenate the str2 string at end of str1.

// Output Format:

// For each test case, print the concatenated string in new lines.
// Sample Input

// 1
// Code Quotient
// Sample Output

// CodeQuotient

static String strcatCode(String a, String b) {
    // Write your code here
      StringBuilder ans = new StringBuilder(a);
      return ans.append(b).toString().trim();
  }