package pl.patryktubicz;

public class Main {

    public boolean isPalindrome(int x) {
        String str_x = String.valueOf(x);
        int length = str_x.length();
        String from_left = "";
        String from_right = "";

        for(int i = 0; i < length; i++) {
            from_left += str_x.charAt(i);
        }
        for(int i = length - 1; i > -1; i--) {
            from_right += str_x.charAt(i);
        }

        return from_left.equals(from_right);
    }

    public static void main(String[] args) {
        Main ob = new Main();
        System.out.println(ob.isPalindrome(101));
    }
}