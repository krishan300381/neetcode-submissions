class Solution {
    public boolean isAnagram(String s, String t) {
        
        int arr[]=new int[26];
        int n=s.length();
        if(t.length()!=n) return false;
        // 'a' = 97
        for(int i=0;i<n;i++){
            int ch1=t.charAt(i);
            int ch2=s.charAt(i);
            arr[ch1-97]++;
            arr[ch2-97]--;
        }
        for(int num: arr){
            if(num!=0) return false;
        }
        return true;

    }
}
