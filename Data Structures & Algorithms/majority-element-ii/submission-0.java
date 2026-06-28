class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        // HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int num : map.keySet()){
            if(map.get(num) > (n/3)){
                list.add(num);
            }
        }

        return list;

        // Hash Array

        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i<n; i++){
        //     max = Math.max(max, nums[i]);
        // }

        // int [] hash = new int [max+1];
        // for(int i = 0;i<n; i++){
        //     hash[nums[i]]++;
        // }
        // for(int i = 0; i<hash.length; i++){
        //     if(hash[i] > n/3){
        //         list.add(i);
        //     }
        // }
        // return list;

        // Brute Force
        // int n = nums.length;
        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i<n; i++){
        //     int count = 0;
        //     for(int j = 0; j<n; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //             if(count > (n/3) && !list.contains(nums[j])){
        //                 list.add(nums[j]);
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return list;
    }
}