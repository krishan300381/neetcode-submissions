class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) { // .add() returns false if the element already exists
                return true;
            }
        }
        return false;
    }
}