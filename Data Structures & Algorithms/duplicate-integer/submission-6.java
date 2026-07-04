class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hd=new HashSet<>();
        for(int num:nums){
            if(hd.contains(num)){
                return true;
            }else{
                hd.add(num);
            }
           
        }
         return false;
    }
}