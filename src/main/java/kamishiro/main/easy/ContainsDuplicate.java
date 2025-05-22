package kamishiro.main.easy;

import java.util.Arrays;

public class ContainsDuplicate {

  public static void main(String[] args) {
    ContainsDuplicate app = new ContainsDuplicate();
    System.out.println(app.containsDuplicate(new int[]{1,2,3,1}));
  }

  private boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        return true;
      }
    }
    return false;
  }
}
