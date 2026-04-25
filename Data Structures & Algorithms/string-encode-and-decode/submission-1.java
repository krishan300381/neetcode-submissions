class Solution {

    public ArrayList<Integer> index=new ArrayList<>();
    public String encode(List<String> strs) {
        String out="";
        for(String st: strs){
            out+=st;
            index.add(out.length());
        }
        return out;
    }

    public List<String> decode(String str) {
        ArrayList<String> out=new ArrayList<>();
        int n=index.size();
        for(int i=0;i<n;i++){
            if(i==0){
                out.add(str.substring(0,index.get(i)));
            }else{
                out.add(str.substring(index.get(i-1),index.get(i)));
            }
        }
        return out;
        
    }
}
