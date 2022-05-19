import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturnFizzWithNumber3(){
        //Given
        int number = 3;
        String expected = "Fizz";

        //When
        String actual = FizzBuzz.fizzbuzzer(number);
        //Then
        assertEquals(expected,actual);

    }

    @Test
    void shouldReturn17WithNumber17(){
        //Given
        int number = 17;
        String expected = "17";

        //When
        String actual = FizzBuzz.fizzbuzzer(number);
        //Then
        assertEquals(expected,actual);

    }

    @Test
    void shouldReturnBuzzWithNumber5(){
        //Given
        int number = 5;
        String expected = "Buzz";

        //When
        String actual = FizzBuzz.fizzbuzzer(number);
        //Then
        assertEquals(expected,actual);

    }

    @Test
    void shouldReturnFizzBuzzWithNumber15(){
        //Given
        int number = 15;
        String expected = "FizzBuzz";

        //When
        String actual = FizzBuzz.fizzbuzzer(number);
        //Then
        assertEquals(expected,actual);

    }

}