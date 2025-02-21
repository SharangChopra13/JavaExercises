public class Palindrome {

    public static void main(String[] args) {
        String str = "nitin";
        boolean isPalindrome = false;
        String temp = "";
        for (int i=str.length()-1; i>=0;i--) {
            temp = temp + str.charAt(i);
        }
        if(str.equals(temp)) {
            isPalindrome = true;
        }
        System.out.print(isPalindrome);
    }
}
