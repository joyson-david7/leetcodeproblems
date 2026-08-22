class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int dup=n;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            pro=pro*rem;
            n/=10;
        }
        if(dup%(sum+pro)==0)
        return true;
        else
        return false;
    }
}