public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println("Is " + 121 + " a Palindrome? " + checkPalin(121));
        System.out.println("Is " + 123 + " a Palindrome? " + checkPalin(123));
        System.out.println("Is " + 10 + " a Palindrome? " + checkPalin(10));
        System.out.println("Is " + 0 + " a Palindrome? " + checkPalin(0));
        System.out.println("Is " + -121 + " a Palindrome? " + checkPalin(-121));
    }

    public static boolean checkPalin(int num){
        if(num < 0) return false;
        int n = num;
        int reversed = 0;
        while(n > 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return reversed == num;
    }
}
