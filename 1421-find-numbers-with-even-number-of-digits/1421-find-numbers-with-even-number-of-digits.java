class Solution {
    public int findNumbers(int[] nums) {
        int answer=0;
        for (int i = 0; i < nums.length; i++) {
            int number=nums[i];
            int count=0;
            while(number>0){
                int rem=number%10;
                count++;
                number=number/10;
            }
            if(count%2==0){
                answer++;
            }
        }
        return answer;
    }
}
