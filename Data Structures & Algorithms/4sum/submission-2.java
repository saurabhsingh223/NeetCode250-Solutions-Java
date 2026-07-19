class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int right = n-1, left = j+1;
                while(right > left){
                    long sum = (long) nums[i]+nums[j]+nums[right]+nums[left];
                    if(sum == target){
                        set.add(Arrays.asList(nums[i], nums[j], nums[right], nums[left]));
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(sum > target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}