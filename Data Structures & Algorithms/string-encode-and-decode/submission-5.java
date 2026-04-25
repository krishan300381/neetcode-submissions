class Solution {

    public String encode(List<String> strs) {
        String ans="";
        // we keep #num#str
        for(String str : strs){
            ans+=""+str.length()+"#"+str+"";
        }
        return ans;
    }

    public List<String> decode(String str) {
        ArrayList<String> res=new ArrayList<>();
        int i=0;
        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;

            res.add(str.substring(i, i + len));
            i += len;
        }
        return res;
    }
}
