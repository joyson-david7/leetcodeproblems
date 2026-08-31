class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min)
            min=nums[i];
            if(nums[i]>max)
            max=nums[i];
        }
                    return findgcd(max,min);

    }
    public int findgcd(int a,int b){
        if(b==0)
        return a;
       return  findgcd(b,a%b);     
    }
}