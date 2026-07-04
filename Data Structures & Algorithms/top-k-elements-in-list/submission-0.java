
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);

        ArrayList<int[]> freqList = new ArrayList<>();

        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                freqList.add(new int[]{nums[i - 1], count});
                count = 1;
            }
        }

        freqList.add(new int[]{nums[nums.length - 1], count});

        freqList.sort((a, b) -> b[1] - a[1]);

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = freqList.get(i)[0];
        }

        return result;
    }
}