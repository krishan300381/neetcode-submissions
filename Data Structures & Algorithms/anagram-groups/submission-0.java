class Solution {
    //sortCharacters(inputString);
    public static String sortCharacters(String s) {
    char[] arr = s.toCharArray();   // convert to char array
    Arrays.sort(arr);               // sort characters
    return new String(arr);         // convert back to String
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
