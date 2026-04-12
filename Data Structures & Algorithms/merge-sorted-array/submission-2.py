class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i=0
        j=0
        while n > 0:
            if m > 0 and nums1[i] <= nums2[j]:
                m-=1
                i+=1
            else:
                nums1.insert(i, nums2[j])
                nums1.pop()
                n-=1
                j+=1
                i+=1
        return nums1