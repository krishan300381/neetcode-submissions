class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int max_Length=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            char c= s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(c);
            max_Length= Math.max(r-l+1 , max_Length);
            
        }
        return max_Length;
    }
}
