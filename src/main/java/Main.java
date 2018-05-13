public class Main {
    public static void main(String[] args) {
        FizzBuzzPlus fizzBuzz = new FizzBuzzPlus();

        for (int i = 1; i <= 100; ++i) {
            String result = fizzBuzz.getResultStringForNumber(i);
            System.out.println(result);
        }
    }
}
