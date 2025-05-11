class Solution {
    public int fib(int n) {
       int initial=0;
       int next=1;
       if(n == 0) return 0;
       if(n == 0) return 1;
       for(int i=2;i<=n;i++){
        int sum=initial+next;
        initial=next;
        next=sum;
       }
       return next;
    }
}