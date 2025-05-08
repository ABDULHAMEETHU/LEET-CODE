class Solution {
    public boolean canJump(int[] nums) {
       int  max_index=0;
       for(int i=0;i<nums.length;i++){
        if(i>max_index) return false;
        max_index=Math.max(max_index,i+nums[i]); //else part
        }
        return true;
    }
}