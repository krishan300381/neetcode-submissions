class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (char c : s1.toCharArray()) {
            map1[c - 'a']++;
        }

        int n = s1.length();

        for (int i = 0; i < n; i++) {
            map2[s2.charAt(i) - 'a']++;
        }

        int match = 0;

        for (int i = 0; i < 26; i++) {
            if (map1[i] == map2[i]) {
                match++;
            }
        }

        int left = 0;

        for (int right = n; right < s2.length(); right++) {

            if (match == 26) {
                return true;
            }

            int add = s2.charAt(right) - 'a';
            int remove = s2.charAt(left) - 'a';

            // ADD CHARACTER

            if (map1[add] == map2[add]) {
                match--;
            }

            map2[add]++;

            if (map1[add] == map2[add]) {
                match++;
            }

            // REMOVE CHARACTER

            if (map1[remove] == map2[remove]) {
                match--;
            }

            map2[remove]--;

            if (map1[remove] == map2[remove]) {
                match++;
            }

            left++;
        }

        return match == 26;
    }
}
