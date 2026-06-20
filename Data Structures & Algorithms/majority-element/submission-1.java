class Solution {
    public int majorityElement(int[] nums) {
        // Optimal Solution -> Moore Voting Algo

        // int count = 0;
        // int element = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if(count == 0){
        //         count = 1;
        //         element = nums[i];
        //     }else if(nums[i] == element){
        //         count++;
        //     }else{
        //         count--;
        //     }
        // }

        // count = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i] == element) count++;
        //     if(count > (nums.length/2)) return element;
        // }
        // return -1;

        // Better Solution

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) > (nums.length/2)) return num;
        }
        return -1;
    }
}