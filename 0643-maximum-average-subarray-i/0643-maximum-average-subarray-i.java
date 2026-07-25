class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        
        for(int i=0;i<k;i++){
             sum=sum+nums[i];
        }
        double avg=sum/k;
         double max=avg;
        int start=0;
        int end=k-1;
        while(end<nums.length-1){
            sum=sum-nums[start++]+nums[++end];
            avg=sum/k;
            if(avg>max)
            max=avg;
}   
return max;

 }
}