// Search element in a rotated sorted array bookmark_border
// Given an array of n integers which is sorted but rotated by some number of times after sorting, and a integer k. Search the element k in this sorted rotated array efficiently. For example, suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

// Assume there are no duplicate elements in the array.

// Expected Time Complexity: O(log(N))

// Expected Space Complexity: O(1)

// Input Format

// First line of input will contain a number T = number of test cases. Each test case will contain 3 lines. The first line will contain an integer k to be searched. Second line will contain a number n = number of elements in the array. Next line will contain N space separated integers. 
// Complete the function int searchRotatedSortedArray() to search a value target in array a of size given, and if target found in the array return its index, otherwise return -1.
// You may assume no duplicate exists in the array.
// Output Format

// Print the index of k in given array for each test case in new line if found and print -1 if k is not present in given array.
// Constraints

//   1 <= T <= 10
//  -1000 <= k <= 1000
//   1 <= n <= 10^5
//  -1000 <= arr[i] <= 1000
// Sample Input

// 2   // Test Cases
// 3               // k (testcase 1)
// 6               // n  
// 15 18 2 3 6 12  // arr[]
// 7               // k (testcase 2)
// 7               // n 
// 4 5 8 9 1 2 3   // arr[]
// Sample Output

// 3
// -1


class Result {
    public static int fxn(int arr[],int n){
        if(n == 0)    return 0;
        int s=0;
        int e=n-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid-1 >=0 && arr[mid] < arr[mid-1]){
                return mid;
            }
            if(mid+1 < n && arr[mid] > arr[mid +1]){
                return mid + 1;
            }
            if(arr[mid] >= arr[s]){
                //ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
    public static int bs(int arr[],int s,int e,int k){
        //int s=0;
        //int e=n-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k)    s=mid+1;
            else    e=mid-1;
        }
        return -1;
    }
  static int searchRotatedSortedArray(int arr[], int k) {
    // Write your code here
    
      int n = arr.length;
      int index = fxn(arr,n);
      if(index == -1){
          return index;
      }
      if(k >= arr[0] && k <= arr[index-1]){
          return bs(arr,0,index-1,k);
      }else{
          return bs(arr,index,n-1,k);
      }
      //return -1;
  }
}