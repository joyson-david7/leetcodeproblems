class Solution {
    public int maxFreqSum(String s) {
        int vfreq=0;
        int cfreq=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                if(map.get(c)>vfreq)
                vfreq=map.get(c);
            }
            else
                if(map.get(c)>cfreq)
                cfreq=map.get(c);
        }
        return vfreq+cfreq;
    }
}