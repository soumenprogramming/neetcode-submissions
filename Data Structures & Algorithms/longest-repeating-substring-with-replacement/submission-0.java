class Solution {
    public int characterReplacement(String s, int k) {
        
        int result=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> list=new HashMap<>();
            int maxf=0;
            for(int j=i;j<s.length();j++){
                list.put(s.charAt(j),list.getOrDefault(s.charAt(j),0)+1);
                maxf=Math.max(maxf,list.get(s.charAt(j)));
                if((j-i+1)-maxf<=k){
                    result=Math.max(result,j-i+1);
                }
            }
           
        }
         return result;
    }
}
