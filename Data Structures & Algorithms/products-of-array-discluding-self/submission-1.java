class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int zeroes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zeroes += 1;
        }

        if (zeroes >= 2)
            return result;
            
        if (zeroes == 1) {
            int prod = 1;
            int location = 0;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] != 0) {
                    prod *= nums[i];
                    result[i] = 0;
                    continue;
                }

                location = i;

            }
            result[location] = prod;
            return result;
        }

        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = prod / nums[i];
        }

        return result;
    
    }
}  
