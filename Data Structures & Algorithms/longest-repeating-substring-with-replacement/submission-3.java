class Solution {
    public int characterReplacement(String s, int k) {

        // freq[i] stores count of character (i + 'A') in current window
        int[] freq = new int[26];

        int l = 0;              // left pointer of sliding window
        int maxFreq = 0;       // max frequency of any char in window (may be stale)
        int maxLen = 0;        // answer

        for (int r = 0; r < s.length(); r++) {

            // expand window: include s[r]
            int idx = s.charAt(r) - 'A';
            freq[idx]++;

            // update maxFreq (ONLY increases, never decreases → may become stale)
            maxFreq = Math.max(maxFreq, freq[idx]);

            /*
             VALIDITY CONDITION:
             windowSize - maxFreq <= k

             Meaning:
             chars to replace = total window - most frequent char
             must be within k
            */

            /*
             IMPORTANT TRICK:
             Use 'if' (not while)

             Reason:
             - maxFreq may be stale (overestimated)
             - condition becomes relaxed
             - violation can increase by at most 1 per step
             - so shrinking once is enough
            */
            if ((r - l + 1) - maxFreq > k) {

                // shrink window from left
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            /*
             Even if window is slightly invalid (due to stale maxFreq),
             maxLen is still correct because:
             - this size was achievable earlier with a valid window
             - we never record an impossible length
            */
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}