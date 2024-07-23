class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // if(k==0){
        // return new int[];
        // }
        int ans[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((obj1, obj2) -> map.get(obj2) - map.get(obj1));
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}