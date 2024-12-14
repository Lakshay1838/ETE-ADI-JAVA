// Find count of a number in a sorted list with duplicates bookmark_border
// Given a sorted list of integers with duplicates, find the count of a given number K in that list in O(log n) time.

// Input

// First line of input will contain a positive integer T = number of test cases. Each test case will contain 2 lines. 
// First line of each test case will contain two number N = number of elements in list and K separated by space. 
// Next line will contain N space separated integers.
// Constraints

//   1 <= N <= 10^5
//  -(10^9) <= arr[i], K <= (10^9)
// Output

// For each test case, print on a single line, the count of number K in this list.
// Sample Input

// 3  // Test Cases
// 10 5  // N K (testcase 1)
// 1 2 2 5 5 5 7 7 7 8
// 10 1  // N K (testcase 2)
// 1 1 1 1 1 1 1 2 2 3
// 20 2  // N K (testcase 3)
// 1 1 1 1 1 2 2 2 2 2 3 3 3 3 3 4 4 4 4 4
// Sample Output

// 3
// 7
// 5

import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static int first(int arr[] ,int n,int k){
        int s=0;
        int e=n-1;
        int ans = -1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                ans = mid;
                e = mid-1;
            }else if(arr[mid] < k){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static int last(int arr[] ,int n,int k){
        int s=0;
        int e=n-1;
        int ans = -1;
        
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                ans = mid;
                s = mid+1;
            }else if(arr[mid] < k){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
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
            int firstOcc = first(arr,n,k);
            int lastOcc = last(arr,n,k);
            if(firstOcc == -1){
                System.out.println(0);
            }else    System.out.println(lastOcc - firstOcc + 1);
        }
    }
}