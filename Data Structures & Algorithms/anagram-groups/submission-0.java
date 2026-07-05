class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
         HashMap<String,List<String>> list=new HashMap<>();

            for(String word:strs){
                char[] a=word.toCharArray();
                Arrays.sort(a);

                String key=new String(a);

                if(!list.containsKey(key)){
                    list.put(key,new ArrayList<>());
                }
                list.get(key).add(word);
            }
            return new ArrayList<>(list.values());
    }
}
