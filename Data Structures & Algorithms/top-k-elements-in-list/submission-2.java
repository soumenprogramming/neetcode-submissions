
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> ss=new ArrayList<>(map.keySet());
        ss.sort((a,b)->Integer.compare(map.get(b),map.get(a)));

        int []result=new int[k];

        for(int i=0;i<k;i++){
            result[i]=ss.get(i);
        }

        return result;
    }
}