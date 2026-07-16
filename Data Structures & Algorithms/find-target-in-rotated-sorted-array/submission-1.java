class Solution {
    public int search(int[] nums, int target) {
        
        // HashSet<Integer> list=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(list.contains(target)){
        //         return i;
        //     }
        //     list.add(nums[i]);
        // }
        // return -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
