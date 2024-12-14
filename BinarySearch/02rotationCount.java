// Rotation count of a sorted Array bookmark_border
// Given an array of integers, find the minimum number of rotations performed on some sorted array to create this given array.
// Input
// First line of input will contain a number T = number of test cases. Each test case will contain 2 lines. First line will contain a number N = number of elements in the array (1 <= N <= 50).
// Next line will contain N space separated integers.
// Complete the function int rotationCount(int array[], int size) which will receive array and size of the array as input and return how many times the sorted array is rotated. Function should return -1 if the array is not rotated.
// Output
// Print one line of output for each test case with the minimum number of rotations for given array.
// Sample Input:
// 2
// 6
// 15 18 3 4 6 12
// 6
// 1 2 3 4 5 6
// Sample Output
// 2
// -1


import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
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
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            if(arr[0] <= arr[n-1]){
                System.out.println(-1);
                //continue;
            }else{
                System.out.println(fxn(arr,n));
            }
        }
    }
}