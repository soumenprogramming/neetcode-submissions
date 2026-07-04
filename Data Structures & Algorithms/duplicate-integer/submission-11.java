
class Solution {
    public boolean hasDuplicate(int[] nums) {

        java.util.concurrent.ConcurrentHashMap<Integer, Integer> map = new java.util.concurrent.ConcurrentHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}