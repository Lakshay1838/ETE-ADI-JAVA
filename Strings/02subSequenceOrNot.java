// String is subsequence or not bookmark_border
// Given two strings, find whether second string is subsequence of first string. A subsequence of a string is defined as a string that can be obtained by deleting any number of characters from the original string.

// Complete the function strSubsequence(str1, str2) that accepts two strings as parameters and print YES if str2 is a subsequence of str1 and NO otherwise.

// Input Format

// The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. 
// Each test case contains a single line of input which contains two strings str1, str2 seperated by a space. 
// Output Format

// For each test case, print YES or NO in new lines.
// Constraints

// 1 <= T <= 10
// Given strings consist of uppercase and lowercase English letters.
// Sample Input

// 3
// CodeQuotient CQ
// CodeQuotient QC
// Hello Hi
// Sample Output

// YES
// NO
// NO

class Result{
    // Return true if the str2 is a subsequence of str1, else return false
    static boolean strSubsequence(String str1, String str2) {
      // Write your code here
      int index = 0;
      for(int i=0;i<str2.length();i++){
          boolean isFound = false;
          for(int j=index;j<str1.length();j++){
              if(str1.charAt(j) == str2.charAt(i)){
                  index = j+1;
                  isFound = true;
                  break;
              }
          }
          if(!isFound){
              return false;
          }
      }
      return true;
    }
  }