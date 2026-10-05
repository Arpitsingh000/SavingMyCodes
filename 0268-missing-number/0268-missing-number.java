class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int nsum = 0;
        for(int i = 0; i <= nums.length; i++){
            nsum += i;
        }
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return nsum - sum;
    }
}