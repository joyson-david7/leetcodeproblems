class Solution {
    public int titleToNumber(String columnTitle) {
        String st=columnTitle;
        int n=columnTitle.length();
        int ans=0;
        int count=0;
        int a=0;
       for(int i=n-1;i>=0;i--){
         a=st.charAt(i)-64;
        ans=ans+a*(int)Math.pow(26,count);
        count++;
       }
       return ans;
    }
}