class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int mincur=0;
        int min=nums[0];
        int maxcur=0;
        int max=nums[0];
        int totsum=0;
        for(int i=0;i<nums.length;i++){
            mincur=mincur+nums[i];
            min=Math.min(min,mincur);
            if(mincur>0)
            mincur=0;
            maxcur+=nums[i];
            max=Math.max(max,maxcur);
            if(maxcur<0)
            maxcur=0;
            totsum=totsum+nums[i];
        }
        if(max<0)
        return max;
        return Math.max(totsum-min,max);

    }
}