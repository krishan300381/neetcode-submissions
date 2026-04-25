class Solution {
    public boolean isAnagram(String s, String t) {
        
        int arr[]=new int[26];
        int n=s.length();
        if(t.length()!= n) return false;
        for(int i=0;i<n;i++){
            arr[t.charAt(i)-'a']++;
            arr[s.charAt(i)-'a']--;
        }
        for(int num: arr){
            if(num != 0) return false;
        }
        return true;

    }
}
