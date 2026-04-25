class Solution {
    
    public static String sortCharacters(String s) {
        int arr[]=new int[26];  
        for(int c:s.toCharArray())
            arr[c-'a']++;
        return Arrays.toString(arr);    
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for( String s: strs){
            String sorted = sortCharacters(s);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
