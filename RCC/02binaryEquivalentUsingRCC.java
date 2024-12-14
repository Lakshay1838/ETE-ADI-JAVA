// Binary equivalent using recursion bookmark_border
// Write a recursive function decimalToBinary that accepts an integer as a parameter and returns an integer whose digits look like that number's representation in binary (base-2). For example, the call of decimalToBinary(43) should return 101011.

// Constraints: Do not use a string in your solution. Also do not use any built-in base conversion functions from the system libraries. solve the problem recursively.

// Sample Input :

// 1 // no. of testcases
// 43
// Sample Output :

// 101011


class Result{ 
    static int decimalToBinary(int n){ 
        if( n == 0)    return 0;
        
        // shift right 
        int bit = n&1;
        n >>= 1;
        
        return decimalToBinary(n) * 10 + bit;
    } 
}