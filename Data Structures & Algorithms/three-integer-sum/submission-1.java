class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        // Optimal -> Sorting+Two Pointers
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left],nums[right] ));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--; 
                }else if(sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return ans;
        // Better Sol
        // Set<List<Integer>> ans = new HashSet<>();
        // for(int i = 0; i<n-1; i++){
        //     Set<Integer> set = new HashSet<>();
        //     for(int j = i+1; j<n; j++){
        //         int k = -(nums[i]+nums[j]);
        //         if(set.contains(k)){
        //             List<Integer> list = Arrays.asList(nums[i],nums[j], k);
        //             Collections.sort(list);
        //             ans.add(list);
        //         }
        //         set.add(nums[j]);
        //     }
        // }
        // return new ArrayList<>(ans);
        
    }
}
