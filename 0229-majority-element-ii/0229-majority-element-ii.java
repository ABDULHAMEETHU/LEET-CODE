class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int p1=0,p2=0,e1=0,e2=0,n=nums.length;
        for(int i : nums){
            if(p1==0 && e2!=i){
                e1=i;
                p1++;
            }
            else if(p2 == 0 && e1!=i){
                e2=i;
                p2++;
            }
            else if(e1==i){
                p1++;
            }
            else if(e2==i){
                p2++;
            }
            else{
                p1--;
                p2--;
            }
        }
        p1=0;
        p2=0;
        List<Integer> answer = new ArrayList<>();
        for(int i:nums){
            if(i==e1){
                p1++;
            }
            else if(i==e2){
                p2++;
            }
        }
        if(p1>n/3) answer.add(e1);
        if(p2>n/3) answer.add(e2);
        return answer;
    }
}