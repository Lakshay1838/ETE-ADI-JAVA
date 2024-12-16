// Find out the winner bookmark_border
// Given an array of strings, find out the string which occurs maximum number of times. If two strings occurs maximum times, return the alphabetically later string. For example,

// if array is ["Amit", "Girdhar", "Amit", "Girdhar", "Girdhar", "Amit", "Amit"] then return "Amit", and

// if array is ["Amit", "Girdhar", "Amit", "Girdhar", "Girdhar", "Amit"] then return "Girdhar" as both occurs 3 times but Girdhar comes after Amit in alphabetical order.

// So, write a function which accepts a string array as input and return the output string.

// Input Format

// The first line contains an integer n, the number of names in string array.
// Each the n subsequent lines contains a string describing array[i] where 0 ≤ i < n.
// Output Format

// Print the output string
// Constraints

// 1 ≤ n ≤ 10^5
// 1 ≤ length of string ≤ 64
// string will contain only lowercase english alphabets i.e. from 'a' to 'z'
// Sample Input

// 6
// Amit
// Girdhar
// Amit
// Girdhar
// Girdhar
// Amit
// Sample Output

// Girdhar

class Result{
    /*     
     * Complete the 'inspectStrings' function below.
     * @params
     *   words -> A string array, which contains the strings
     *  
     * @return
     *   A String, which occurs the maximum numbers of times
     */
    static String inspectStrings(String[] words) {
        
        Map<String,Integer> mp = new HashMap<>();
        
        String ans = "";
        int count=0;
        
        for(String s:words){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> entry :mp.entrySet()){
            if(entry.getValue() > count){
                count = entry.getValue();
                ans = entry.getKey();
            }else if(count == entry.getValue()){
                if(entry.getKey().compareTo(ans) > 0){
                    ans = entry.getKey();
                }
            }
        }
        return ans;
    }
  }