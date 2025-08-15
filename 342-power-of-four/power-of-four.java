class Solution {
    public boolean isPowerOfFour(int n) {
        
         if (n <= 0) return false;
        // power of two
        if ( (n & (n - 1)) != 0 ) return false;
        // (4^k - 1) % 3 == 0  -> so n % 3 == 1 for powers of four
        return n % 3 == 1;
    }
}