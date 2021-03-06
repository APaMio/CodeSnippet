class Solution {
  public int minMoves(int[] nums) {
      int min = Integer.MAX_VALUE;
      int res = 0;
      for (int num: nums) { min = Math.min(min, num); }

      for (int num: nums) { res += Math.abs(num - min); }
      return res;
  }
}