package additional_junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamCrestTests {
    private Spartan spartan;

    @BeforeEach
    void setup() {
        spartan = new Spartan(1,"Manish","Java", LocalDate.now());
    }

    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class HamcrestSpartanTests {
        @Test
        @DisplayName("Hamcrest: Spartan is called Manish")
        void checkThatSpartanIsCalledManish() {
            assertThat(spartan.getName(), equalTo("Manish"));
        }

        @Test
        @DisplayName("Hamcrest: Spartan has a field called 'name'")
        void hamcrestSpartanHasAFieldCalledName() {
            assertThat(spartan,hasProperty("name"));
        }

        @Test
        @DisplayName("Hamcrest: Spartan has a field called course and it is set to Java")
        void SpartanHasAFieldCalledCourseAndItIsSetToJava() {
            assertThat(spartan,hasProperty("course",equalTo("Java")));
        }

    }

    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamcrestStringMethods{
        @Test
        @DisplayName("Hamcrest: check a string is null or empty")
        void hamcrestCheckAStringIsNullOrEmpty() {
            assertThat(spartan.getName(), isEmptyOrNullString());
        }

        @Test
        @DisplayName("Hamcrest: check that 'Manish' ends with 'ish'")
        void hamCrestCheckThatManishEndsWithIsh(){
            assertThat(spartan.getName(),endsWith("ish"));
        }
    }
}
