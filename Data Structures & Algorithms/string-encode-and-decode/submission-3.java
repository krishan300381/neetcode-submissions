class Solution {

    
    public String encode(List<String> strs) {
        String out="";
        for(String st: strs){
            out += st.length() + "#" + st;
        }
        return out;
    }

    public List<String> decode(String str) {
        ArrayList<String> out=new ArrayList<>();
        
        for(int i=0;i<str.length();){
            if(i>=str.length()) return out;
            int start=i;
            while(str.charAt(i)!='#'){
                i++;
            }
            int v= Integer.parseInt(str.substring(start,i));
            
            out.add(str.substring(i+1,i+v+1));
            i+=v+1;
        }
        return out;
        
    }
}
