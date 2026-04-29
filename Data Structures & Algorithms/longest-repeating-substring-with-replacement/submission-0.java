class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0 ;r<n;r++){
            char c= s.charAt(r);
            if(map.containsKey(c)){
                int v = map.get(c);
                map.put(c,v+1);
            }else{
                map.put(c,1);
            }
            
            int maxVal = Collections.max(map.values());
            while ((r - l + 1) - maxVal > k) {
                char d = s.charAt(l);
                int v = map.get(d);

                if (v == 1) map.remove(d);
                else map.put(d, v - 1);

                l++;
                maxVal = Collections.max(map.values()); // recompute after shrink
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
