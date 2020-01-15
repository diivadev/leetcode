class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int delta = target - nums[i];
            // System.out.println(delta);
            if (map.containsKey(delta)){
                return new int[] {i, map.get(delta)};
            }

            map.put(nums[i], i);
            // System.out.print(map);
        }

        return new int[] {-1, -1};

    }
}
