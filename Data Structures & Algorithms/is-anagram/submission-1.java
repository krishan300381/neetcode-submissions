class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        if(n!=t.length()) return false;
        HashMap <Character,Integer> map=new HashMap();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if( map.containsKey(c) ){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            if( map.containsKey(c) ){
                int v=map.get(c);
                if(v==0) return false;
                map.put(c,--v);
            }else{
                return false;
            }
        }
        return true;
    }
}
