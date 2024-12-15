// Count words bookmark_border
// Write a function countWords() to count the numbers of words in a string.

// A word is defined as text separated by space(' ') or multiple spaces.

// The function will receive a string as input and return the numbers of words in this string. 

// Input Format

// A single line of input which consists of the string whose words is to be counted
// Output Format

// Print the count the numbers of words in a string
// Sample Input

// Codequotient get better  at coding
// Sample Output

// 5


class Result {
    static int countWords(String str) {
      // Write your code here
        if(str.isEmpty()){
            return 0;
        }
      String[] words = str.trim().split("\\s+");
      return words.length;  
    }
  }