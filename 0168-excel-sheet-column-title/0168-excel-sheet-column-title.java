class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        String st="";
        int rem=0;
        while(n!=0){
            n=n-1;
            rem=n%26;
            st=(char)(rem+65)+st;
            n=n/26;
        }
        return st;
    }
}