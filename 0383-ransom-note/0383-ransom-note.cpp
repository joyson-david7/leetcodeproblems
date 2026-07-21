class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        map<char,int>rn;
        for(auto p:ransomNote){
            rn[p]++;
        }
        map<char,int>mz;
        for(auto p:magazine){
            mz[p]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(rn[ransomNote[i]]>mz[ransomNote[i]])
            return false;

        }
        return true;
    }
};