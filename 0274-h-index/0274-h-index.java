class Solution {
    public int hIndex(int[] citations) {
        int[] count = new int[citations.length+1];
        for(int i : citations){
            if(i>=citations.length){
                count[citations.length]+=1;
            }
            else{
                count[i]+=1;
            }
        }
        int paperAtleastCitations=0;
        for(int j=citations.length;j>=0;j--){
            paperAtleastCitations+=count[j];
            if(paperAtleastCitations>=j){
                return j;
            }
        }
        return 0;
    }
}