class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        n,m=len(s1),len(s2)
        if n>m:
            return False
        need =[0]*26
        word=[0]*26
        a=ord('a')
        for i in range(n):
            need[ord(s1[i])-a]+=1
            word[ord(s2[i])-a]+=1

        if need==word:
            return True

            return true
        for j in range(n,m):
            word[ord(s2[j])-a]+=1
            word[ord(s2[j-n])-a]-=1
            if word==need:
                return True
        return False
