class Solution {
    public String sortChar(String s){
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        return Arrays.toString(arr);

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(String s:strs){
            String key=sortChar(s);
            map.computeIfAbsent(key,k->new ArrayList<>()) .add(s);
            //here if key is available the new list will not inetialize.

        }
        return new ArrayList<>(map.values());
    }
}
