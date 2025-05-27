class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int answer=0;
        while(x>0){
            int remainder=x%10;
            answer=answer*10+remainder;
            x=x/10;
        }
        if(answer==original){
            return true;
        }
        else{
            return false;
        } 
    }
}