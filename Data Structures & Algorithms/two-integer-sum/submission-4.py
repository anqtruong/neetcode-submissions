class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        seen = {} # Create a dict

        for i, num in enumerate(nums): # i is index. num is num @ index
            complement = target - num # the number needed to "complete" the pair to equal target
            if complement in seen: # the number to complete the target exists
                return [seen[complement], i] # returns idx of complement and idx of curr num
            seen[num] = i # add curr num to seen, with idx as the value