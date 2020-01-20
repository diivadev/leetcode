class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : nums){
                if (map.containsKey(i)){
                    int val = map.get(i);
                    val++;
                    map.put(i, val);
                } else {
                    map.put(i, 1);
                }
            }

            // System.out.print(map);

            List<Integer> rList = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(e -> e.getKey())
                .collect(Collectors.toList());

            return rList.subList(0, k);
        }
}
