package EasyPalidrome;

public class EsPal extends Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}

class Solution {
    public static boolean isPalindrome(int x) {
        int reversed = 0;
        int temp = x;

        if (x < 0){
            return false;
        }

        while (temp != 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (reversed == x){
            return true;
        } else {
            return false;
        }
    }
}