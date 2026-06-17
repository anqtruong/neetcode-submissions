class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        output = []

        indexJ = 1

        for indexI, i in enumerate(nums):
            for indexJ, j in enumerate(nums):
                if indexI == indexJ:
                    continue
                if i + j == target:
                    output.append(indexI)
                    output.append(indexJ)
                    return output

        return output