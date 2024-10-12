//Question Link: https://leetcode.com/problems/contains-duplicate/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>numset=new HashSet<>();
        for(int n:nums){
            if(!numset.add(n)){
                return true;
            }
        }
        return false;
    }
}
