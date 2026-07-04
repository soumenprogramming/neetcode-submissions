
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];
        int index = 0;

        while (k > 0) {

            int maxFreq = -1;
            int maxKey = -1;

            for (int key : map.keySet()) {
                int freq = map.get(key);

                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxKey = key;
                }
            }

            result[index] = maxKey;
            index++;

            map.remove(maxKey);

            k--;
        }

        return result;
    }
}