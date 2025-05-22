package kamishiro.main.easy;

public class RemoveDuplicatesFromSortedArray {

  public static void main(String[] args) {
    RemoveDuplicatesFromSortedArray app = new RemoveDuplicatesFromSortedArray();
    System.out.println(app.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
  }

  private int removeDuplicates(int[] nums) {
    int j = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }
}
