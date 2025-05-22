package kamishiro.main.easy;

public class PalindromeNumber {

  public static void main(String[] args) {
    PalindromeNumber app = new PalindromeNumber();
    System.out.println(app.isPalindrome(21512));
  }

  private boolean isPalindrome(int x) {
    String original = String.valueOf(x);
    String reversed = new StringBuilder(original).reverse().toString();
    return original.equals(reversed);
  }
}
