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
        while(i<str.length()){
            String num = "";
            while(str.charAt(i) != '#'){
                num+= str.charAt(i);
                i++;
            }i++;   
            
            int n = Integer.parseInt(num);
            n+=i;
            String ans= "";

            while(i<n){
                ans+=str.charAt(i);
                i++;
            }
                
            
            res.add(ans);

        }
        return res;
    }
}
