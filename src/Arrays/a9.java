package Arrays;

public class a9 {

    public static void main(String[] args) {
        int x = 10;
        a9 a9 = new a9();
        System.out.println(a9.isPalindrom(x));
    }

    public boolean isPalindrom(int x) {
        String input = String.valueOf(x);
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            } else {
                left += 1;
                right -= 1;
            }
        }

        return true;
    }
}
