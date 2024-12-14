// Reverse the order of words of a string bookmark_border
// Given a string of words, reverse the order of words in the string individually, not the whole string.
// Complete the function revWordsOrder(str) that accepts a string as parameter and reverses the order of words of string.
// Input Format:
// The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. Each test 
// case contains the string str. 
// Output Format:
// For each test case, print the resultant string in new lines.
// Sample Input
// 2
// Code Quotient Loves Code
// Hello Coders
// Sample Output
// Code Loves Quotient Code
// Coders Hello

class Result {
    static String revWordsOrder(String str) {
      // Write your code here
        String[] words = str.split(" ");
        //int n = words.length;
        StringBuilder ans = new StringBuilder();
        for(int i=words.length - 1;i>=0;i--){
            ans.append(words[i]).append(" ");
        }
        return ans.toString().trim();
    }
  }