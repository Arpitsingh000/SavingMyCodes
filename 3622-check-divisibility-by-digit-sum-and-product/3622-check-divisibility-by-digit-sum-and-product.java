class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int temp = n;
        while(temp > 0){
            int rem = temp%10;
            sum += rem;
            pro *= rem;
            temp = temp/10;
        }
        int div = sum+pro;
        if(n%div==0) return true;
        else return false;

    }
}