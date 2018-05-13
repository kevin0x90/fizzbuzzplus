import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FizzBuzzPlusTest {

    private FizzBuzzPlus target = null;

    @Before
    public void setup() {
        target = new FizzBuzzPlus();
    }

    @Test
    public void given_a_number_neither_multiple_of_3_or_5_it_should_return_the_number() {
        String result = target.getResultStringForNumber(1);

        assertThat(result, equalTo("1"));
    }

    @Test
    public void given_a_multiple_of_3_it_should_return_fizz() {
        String result = target.getResultStringForNumber(3);

        assertThat(result, equalTo("Fizz"));
    }

    @Test
    public void given_a_multiple_of_5_it_should_return_buzz() {
        String result = target.getResultStringForNumber(5);

        assertThat(result, equalTo("Buzz"));
    }

    @Test
    public void given_a_multiple_of_3_and_5_it_should_return_fizzbuzz() {
        String result = target.getResultStringForNumber(15);

        assertThat(result, equalTo("FizzBuzz"));
    }

    @Test
    public void given_a_number_that_contains_5_it_should_return_a_string_containing_buzz() {
        String result = target.getResultStringForNumber(51);

        assertThat(result, containsString("Buzz"));
    }

    @Test
    public void given_a_number_that_contains_3_it_should_return_a_string_containing_fizz() {
        String result = target.getResultStringForNumber(31);

        assertThat(result, containsString("Fizz"));
    }

    @Test
    public void given_0_it_should_still_return_0() {
        String result = target.getResultStringForNumber(0);

        assertThat(result, equalTo("0"));
    }
}
