class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str=str+Character.toLowerCase(c);
            }
        }
        int n=str.length();
        int j=n-1;
        int i=0;
        while(i<j){
            
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else
            return false;
        }
        return true;
    }
}