class Solution {
    public int candy(int[] ratings) {
        int sum=1;
        int i=1;
        int n=ratings.length;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum=sum+1;
                i++;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak++;
                sum=sum+peak;
                i++;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum=sum+down;
                down++;
                i++;
            }

            if(down>=peak){
                sum=sum+(down-peak);
            }
        }
        return sum;
    }
}