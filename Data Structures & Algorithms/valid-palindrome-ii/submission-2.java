class Solution {
    public boolean validPalindrome(String s) {
    int l=0;
    int r=s.length()-1;
    while(l<r){
        if(s.charAt(l)!=s.charAt(r)){
            return ispalindrome(s.substring(0,l)+s.substring(l+1))||
            ispalindrome(s.substring(0,r)+s.substring(r+1));
        }
        l++;
        r--;
    }
    return true;}
    public boolean ispalindrome(String s){
    int l=0;
    int r=s.length()-1;
    while(l<r){
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
    
    l++;
    r--;}
    return true;
    }   
    }
