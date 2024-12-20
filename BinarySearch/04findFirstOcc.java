// Find first occurrence of an integer in a sorted list with duplicates
// Given a sorted list of integers, find the position of first occurrence of a given number K in the list in O(log n) time.

// Input Format:

// First line of input will contain a positive integer T = number of test cases.
// Each test case will contain the following two lines:
//   First line will contain two positive integer N = number of elements in list and K.
//   Second line will contain N space separated integers in increasing order.
// Constraints:

//   1 <= N <= 10^5
//  -(10^9) <= arr[i], K <= (10^9)
// Output Format:

// For each test case, print on a single line the index of first occurrence of K in the list on 0-based index. Print -1 if you cannot find K in the list.
// Sample Input

// 3  // Test Cases
// 10 4  // N K (testcase 1)
// 1 2 4 4 4 4 5 8 9 10
// 15 7  // N K (testcase 2)
// 1 2 3 3 5 6 7 7 7 7 7 8 8 8 8
// 9 1   // N K (testcase 3)
// -5 -4 -3 -2 -1 0 0 0 1
// Sample Output

// 2
// 6
// 8

import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        int s=0;
        int e=n-1;
        int ans = -1;
        while(s<=e){
          int mid = s+(e-s)/2;
          if(arr[mid] == k){
            ans = mid;
            e=mid-1;
          }else if(arr[mid] > k)    e=mid-1;
          else s=mid+1;
        }
        System.out.println(ans);
      }
    }
}