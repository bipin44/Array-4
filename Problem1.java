// Time: O(nlogn)
// Space: O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = 1 ; i< nums.length ; i = i+2){
            res = Math.min(nums[i], nums[i-1]) + res;
        }
        return res;
        
    }
}