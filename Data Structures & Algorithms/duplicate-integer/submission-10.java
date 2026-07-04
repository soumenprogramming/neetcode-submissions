class Solution {
    public boolean hasDuplicate(int[] nums) {
        
       HashMap<Integer,Integer> list=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(list.containsKey(nums[i])){
            return true;
        }
        list.put(nums[i],i);
       }
       return false;
    }
}