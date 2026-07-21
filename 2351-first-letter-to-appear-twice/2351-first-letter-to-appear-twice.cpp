class Solution {
public:
    char repeatedCharacter(string s) {
         map<char, int> freq;

        

        for (int i = 0; i < s.length(); i++) {
             freq[s[i]]++;
            if (freq[s[i]] == 2) {
                return s[i];
            }
        }

        return -1;
    }
};