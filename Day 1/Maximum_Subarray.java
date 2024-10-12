//Question Link: https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i:nums){
            currentsum+=i;
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0){
                currentsum=0;
            }
        }
        return maxsum;
    }
}
