class Solution {
    public int majorityElement(int[] nums) {
        int element=nums[0];
        int point=1;
        for(int i=1;i<nums.length;i++){
            if(point==0){
                element=nums[i];
                point++;
            }
            else if(element==nums[i]){
                point++;
            }
            else{
                point--;
            }
        }
        return element;
    }
}