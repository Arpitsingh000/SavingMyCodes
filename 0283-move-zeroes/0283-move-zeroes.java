class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length){
            if(nums[i] == 0 && nums[j] == 0) j++;
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return;
    }
}