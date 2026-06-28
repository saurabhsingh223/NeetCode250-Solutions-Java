class Solution {
    public int removeDuplicates(int[] nums) {
        //Optimal -> Two Pointer
        int i = 0;
        for(int j = 0; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;


        //Brute Force

        // Set<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // int i = 0;
        // for(int num : set){
        //     nums[i++] = num;
        // }
        // return set.size();
    }
}