class Solution {
    public boolean isPerfectSquare(int num) {
        int min=1;
        int max=46340;
        while(min<=max){
            int mid=(min+max)/2;
            int pro=mid*mid;
            if(pro==num)
            return true;
            if(pro<num)
            min=mid+1;
            else
            max=mid-1;
        }
        return false;
    }
}