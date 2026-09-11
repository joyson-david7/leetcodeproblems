class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>set=new HashSet<>();
        for(int n:candyType)
        set.add(n);
        if(set.size()==candyType.length/2)
        return set.size();
        else if(set.size()>candyType.length/2)
        return candyType.length/2;
        else 
        return set.size();
    }
}