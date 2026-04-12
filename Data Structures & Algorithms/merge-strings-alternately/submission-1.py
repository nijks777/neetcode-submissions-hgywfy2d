class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        wc1=list(word1)
        wc1_len=len(wc1)
        wc2=list(word2)
        wc2_len=len(wc2)
        final=list()
        c=0
        i,j=0,0
        while i<wc1_len and j<wc2_len:
            if c%2==0:
                final.append(wc1[i])
                i+=1
                c+=1
            else:
                final.append(wc2[j])
                j+=1
                c+=1
        while i<wc1_len:
                final.append(wc1[i])
                i+=1
                c+=1
        while j<wc2_len:
                final.append(wc2[j])
                j+=1
                c+=1
        final_str="".join(final)
        return final_str
