class Solution:
    def validPalindrome(self, s: str) -> bool:
        i=0
        j=len(s)-1
        count=1
        while i<j:
            if s[i]!=s[j]:
                sl=s[i+1:j+1]
                sr=s[i:j]
                return sr==sr[::-1] or sl==sl[::-1]
            i,j=i+1,j-1
        return True