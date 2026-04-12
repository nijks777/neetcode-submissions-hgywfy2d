class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        ans=sorted(list(set(nums)))
        for i in range(len(ans)):
            nums[i] = ans[i]
        res=len(ans)
        return res