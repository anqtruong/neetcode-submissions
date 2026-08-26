class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement;
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];

            if (map.containsKey(complement)) {
                solution[0] = map.get(complement);
                solution[1] = i;
                return solution;
            }

            map.put(nums[i], i);
        }
        return solution;
    }
}
