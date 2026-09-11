class Solution:
    def reverseVowels(self, s: str) -> str:
        vow=""
        vowel="aeiouAEIOU"
        ind =-1
        for chr in s:
            if vowel.find(chr) != -1:
                vow+=chr
        
        li=list(s)
        for i in range(len(s)):
            if vowel.find(li[i]) != -1:
                li[i]=vow[ind]
                ind-=1

        return "".join(li)