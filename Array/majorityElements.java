class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // return nums[n/2];

        // HashMap<Integer, Integer> map=new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        // if(map.containsKey(nums[i])){
        // map.put(nums[i], map.get(nums[i])+1);
        // }else{
        // map.put(nums[i], 1);
        // }
        // }
        // for(Map.Entry<Integer, Integer> list : map.entrySet()){
        // if(list.getValue()>nums.length/2){
        // return list.getKey();
        // }
        // }
        // return -1;

        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;

    }
}