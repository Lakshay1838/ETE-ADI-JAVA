// Unique characters or not bookmark_border
// Given a string, you need to test the characters for their uniqueness. If all the characters occur at most 1 time in the string, then print “YES”, otherwise if some character occurs at least twice in the string print “NO”.

// Input Format:

// The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains the string str. 
// Function void isUniqueChars(char *str) will take the string as parameter and print YES or NO according to the occurence of characters in it.
// Output Format:

// For each test case, print YES or NO in new lines.
// Constraints:

// 1 <= T <= 10
// Given string can contain any valid ASCII character.
// Sample Input

// 2
// CodeQuotient
// Coding
// Sample Output

// NO
// YES

import java.util.*;
class Result{
  // Return true if string contains all unique characters, else return false
  static boolean isUniqueChars(String str){
    // Write your code here
      Map<Character,Integer> mp = new HashMap<>();
      
      for(char ch:str.toCharArray()){
          if(mp.getOrDefault(ch,0) == 1){
              return false;
          }
          mp.put(ch,1);
      }
      return true;
  }
}