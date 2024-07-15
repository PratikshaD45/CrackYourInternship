import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            int element = iterator.next();
            nums[i] = element;
            i++;
        }
        return set.size();

    }
}