class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]res=new int[2*nums.length];
        int j=0;
        for(int num:nums){
            res[j++]=num;
        }
        for(int num:nums){
            res[j++]=num;
        }
        return res;
    }
}