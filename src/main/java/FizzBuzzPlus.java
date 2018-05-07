public class FizzBuzzPlus {

    public String getResultStringForNumber(final int number) {

        String result = "";
        final FizzBuzz fizz = FizzBuzz.FIZZ;
        final FizzBuzz buzz = FizzBuzz.BUZZ;

        if (fizz.divides(number) || fizz.isPartOf(number)) {
            result += fizz;
        }

        if (buzz.divides(number) || buzz.isPartOf(number)) {
            result += buzz;
        }

        if (result.isEmpty()) {
            return Integer.toString(number);
        }

        return result;
    }

    private enum FizzBuzz {
        FIZZ("Fizz", 3),
        BUZZ("Buzz", 5);

        private final int number;
        private final String displayValue;

        FizzBuzz(final String displayValue, final int number) {
            this.number = number;
            this.displayValue = displayValue;
        }

        public boolean divides(final int number) {
            return number % this.number == 0;
        }

        public boolean isPartOf(final int number) {
            int remainingNumber = number;

            while (remainingNumber > 0) {
                int digit = remainingNumber % 10;
                remainingNumber /= 10;

                if (digit == this.number) {
                    return true;
                }
            }

            return false;
        }

        @Override
        public String toString() {
            return displayValue;
        }
    }
}
