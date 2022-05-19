public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzbuzzer(i+1));
        }
    }

    public static String fizzbuzzer(int number) {
        if (number%3==0 && number%5==0){
            return "FizzBuzz";
        } else if (number%3==0){
            return  "Fizz";
        } else if (number%5==0) {
            return  "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}