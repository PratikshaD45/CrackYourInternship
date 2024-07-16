class Solution {
    public void sortColors(int[] nums) {

        // Brute Force Approach

        // for(int i=0; i<nums.length-1; i++){
        // for(int j=i; j<nums.length; j++){
        // if(nums[i]>=nums[j]){
        // int temp=nums[i];
        // nums[i]=nums[j];
        // nums[j]=temp;
        // }

        // }

        // }

        // Optimal Approach

        // int zeros=0;
        // int ones=0;
        int n = nums.length;
        // for(int i=0; i<n; i++){
        // if(nums[i]==0){
        // zeros++;
        // }else if(nums[i]==1){
        // ones++;
        // }
        // }
        // for(int i=0; i<zeros; i++){
        // nums[i]=0;
        // }
        // for(int i=zeros; i<zeros + ones; i++){
        // nums[i]=1;
        // }
        // for(int i=zeros + ones; i<n; i++){
        // nums[i]=2;
        // }

        // better Approach
        int l = 0, m = 0;
        int h = n - 1;
        while (m <= h) {
            if (nums[m] == 0) {
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;

            } else if (nums[m] == 2) {
                int temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;
                h--;

            } else {
                m++;
            }
        }

    }
}