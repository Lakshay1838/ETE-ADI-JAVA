// Form a new number bookmark_border
// Write a recursive function evenDigits that accepts an integer parameter n and returns a new integer containing only the even digits from n, in the same order. If n does not contain any even digits, return 0.

// For example, the call of evenDigits(8342116) should return 8426 and the call of evenDigits(35179) should return 0.


import java.util.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static int fxn(int n){
        if(n <= 0)    return 0;
        
        int rem = n%10;
        if(rem%2 == 0){
            return fxn(n/10) * 10 + rem;
        }
        return fxn(n/10);
    }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int neg=1;
            if(n < 0){
                neg = -1;
                n *= -1;
            }
            System.out.println(fxn(n) * neg);
        }
    }
}