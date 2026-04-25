class Solution {
    //sortCharacters(inputString);
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
            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }else{
                ArrayList<String> list=new ArrayList();
                list.add(s);
                map.put(sorted,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
