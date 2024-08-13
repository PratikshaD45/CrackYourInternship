class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int si = 0;
        int ei = nums.length - 1;
        int mid = (si + ei) / 2;
        int minMoves = 0;
        for (int i = 0; i < mid; i++) {
            minMoves += (nums[mid] - nums[i]);

        }
        for (int i = mid + 1; i <= ei; i++) {
            minMoves += nums[i] - nums[mid];
        }
        return minMoves;

    }
}
