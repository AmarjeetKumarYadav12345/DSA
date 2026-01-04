class Solution {
    public boolean isPalindrome(int x) {
    
    if(x < 0){

        return false;

    }

    int temp=x;
    int rev=0;
    while(x>0){
        int lastdigit=x%10;
        x=x/10;
        rev=(rev*10)+lastdigit;
    }
    if(rev==temp){
        return true;
    }
    else {
        return false;
    }
        
    }
}