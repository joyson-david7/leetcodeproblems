class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>res=new  ArrayList<>();
        for(String s:words){
            if(check(s,pattern)){
                res.add(s);
            }
        }
        return res;
    }
    boolean check(String s,String p){
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))!=p.indexOf(p.charAt(i)))
            return false;
        }
        return true;
    }
}