class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, j = 0;
        int max = 0;
        while (j < nums.length) {
            if (nums[j] == 1)
                j++;
            else {
                int diff = j - i;
                if (diff > max)
                    max = diff;
                j++;
                i = j;
            }
        }
        int diff = j - i;
        if (diff > max)
            max = diff;
        return max;
    }
}