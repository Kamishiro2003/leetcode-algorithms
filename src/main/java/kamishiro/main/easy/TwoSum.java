package kamishiro.main.easy;

import java.util.HashMap;
import java.util.stream.Stream;

public class TwoSum {

  public static void main(String[] args) {
    TwoSum app = new TwoSum();
    int[] result = app.twoSum(new int[]{2,7,11,15}, 9);
    for (int number : result) {
      System.out.println(number);
    }
  }

  private int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return new int[]{};
  }
}
