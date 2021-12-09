package additional_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionsTest {
    private ArrayList<Integer> numbers;

    @BeforeEach
    void setup() {
        numbers = new ArrayList<>(Arrays.asList(1,2,3));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,10})
    @DisplayName("Which values throws an out of bounds exception")
    void checkForOutOfBoundsException(int number) {
        Exception exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> numbers.get(number));
        System.out.println(exception.getMessage());
    }
}
