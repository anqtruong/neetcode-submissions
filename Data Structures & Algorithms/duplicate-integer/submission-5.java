
class Solution {


    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
        }

        return res.size() != nums.length;
    }
}