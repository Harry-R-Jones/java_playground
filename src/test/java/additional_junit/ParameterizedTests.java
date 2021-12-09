package additional_junit;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.fail;

public class ParameterizedTests {



@Nested
@DisplayName("First parameterized test")
class FirstTest {
    @ParameterizedTest()
    @ValueSource(ints = {2,0,10,15,13})
    @DisplayName("Using ints for a parameterized test")
    void doTest(int number) {
        Assertions.assertTrue(number < 10);

    }}

    @ParameterizedTest
//    @CsvSource({"Kieran", "Manish"})
    @CsvFileSource(resources = "/names.csv")
    @DisplayName("Testing with literal CSV values")
    void testingForCsvValues(String name) {
        Assertions.assertEquals("Manish", name);
    }

    @ParameterizedTest
    @MethodSource("printArrays")
    void testThatArraysCanBePrinted(Integer number, String name)  {
        Assertions.assertEquals(number, name.length());
    }

    public static Stream<Arguments> printArrays() {
        return Stream.of(
                Arguments.arguments(5, "Harry"),
                Arguments.arguments(6, "Manish"),
                Arguments.arguments(6, "Kieran")

        );
    }

}
