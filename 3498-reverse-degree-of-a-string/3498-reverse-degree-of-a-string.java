class Solution {
    public int reverseDegree(String s) {
        int sum=0; 
        for(int i=0;i<s.length();i++){
            sum=sum+(i+1)*Math.abs(123-s.charAt(i));
        }
        return sum;
    }
}