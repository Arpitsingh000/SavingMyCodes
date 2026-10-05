class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, j = 0;
        int max = 0;
        while (j < nums.length) {
            if (nums[i] == 1) {
                if (nums[i] == nums[j])
                    j++;
                else {
                    int diff = j - i;
                    i = j;
                    if (diff > max)
                        max = diff;
                }
            } else {
                i++;
                j++;
            }
        }
        int diff = j - i;
        i = j;
        if (diff > max)
            max = diff;
        return max;
    }
}