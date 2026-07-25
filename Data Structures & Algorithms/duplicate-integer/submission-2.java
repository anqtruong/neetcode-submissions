
class Solution {


    public boolean hasDuplicate(int[] nums) {
        Set<Integer> myHash = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (myHash.contains(nums[i]))
                return true;
            myHash.add(nums[i]);
        }

        return false;
    }
}