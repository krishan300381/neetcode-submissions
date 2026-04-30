class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] =new int [26];
        int max_freq=0;
        int l=0;
        int maxlen=0;
        for(int r=0;r<s.length();r++){

            char c=s.charAt(r);
            freq[c-'A']++;
            
            if(max_freq < freq[c-'A']) max_freq=freq[c-'A'];

            
            if(r-l+1-max_freq > k ){
                freq[s.charAt(l)-'A']--;
                l++;
            }

            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}