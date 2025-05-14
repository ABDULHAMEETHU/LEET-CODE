class Solution {
    public int searchInsert(int[] nums, int target) {
        int position=0;
        for(int i=0;i<nums.length;i++){
            if(target>nums[i]){
                position++;
            }
        }
        return position;
    }
}