class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        HashMap<Integer, Integer> map = new HashMap<>();



        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                continue;
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> map.get(b) - map.get(a));

        int[] resultK = new int[k];

        for (int i = 0; i < resultK.length; i++) {
            resultK[i] = keys.get(i);
        }
        
        return resultK;

    }
}
