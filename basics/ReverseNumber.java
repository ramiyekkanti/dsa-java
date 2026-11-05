public class ReverseNumber {
    public static void main(String[] args){
        System.out.println("Reversed Number: " + revNum(123));
        System.out.println("Reversed Number: " + revNum(5));
        System.out.println("Reversed Number: " + revNum(1200));
        System.out.println("Reversed Number: " + revNum(0));
        System.out.println("Reversed Number: " + revNum(-123));
    }

    public static int revNum(int num){
        int n = (num<0) ? num * -1 : num;
        int reversed = 0;
        while(n > 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return (num < 0) ? reversed * -1 : reversed;
    }
}
