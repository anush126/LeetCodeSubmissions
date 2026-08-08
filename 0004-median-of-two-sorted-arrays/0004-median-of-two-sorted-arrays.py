class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        ans=0
        nums3=nums1+nums2
        nums3.sort()
        if len(nums3)%2!=0:
            ans=nums3[(len(nums3)//2)]
            print(nums3,ans)
        else:
            mid1=(len(nums3)/2)-1
            mid2=(len(nums3)/2)
            print(nums3,nums3[mid1],nums3[mid2])
            ans=(nums3[mid1]+nums3[mid2])/2.0
        return ans
        