package additional_junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class SpartanTests {
    Spartan spartan;
    Spartan spartanFail;
    @BeforeAll
    static void setupAll(TestInfo testinfo){
        System.out.println(testinfo.getTestClass() + " executing");
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        spartan = new Spartan(1, "Harry", "Java", LocalDate.of(2021, 1, 1));

        System.out.println(testInfo.getDisplayName() + " is being tested");

    }

    @Tag("MyTests")
    @Test
    @DisplayName("Spartan is called Harry")
    void spartanIsCalledHarry() {
        assumeTrue(spartan.getName() != null);
        Assertions.assertEquals("Harry", spartan.getName());
    }

    //getId();
    @Tag("MyTests")
    @Test
    void returnsTrueID() {
        assertTrue(spartan.getId() == 1);
    }

    //setId();
    @Tag("MyTests")
    @Test
    void canSetId() {
        assumeTrue(spartan.getId() != 5);
        spartan.setId(5);
        assertTrue(spartan.getId() == 5);
    }

    @Tag("MyTests")
    @Test
    void setValidID(){
        //Ids can be between 1-10
        assumeTrue(spartan.getId() < 11 && spartan.getId() >-1);
        spartan.setId(14);
        assertTrue(spartan.getId() < 11 && spartan.getId() > -1);
    }

    //getName();
    //Test that the getName() returns the name of someone at the company (Not some random other name)
    //Name is formatted a particular way

    @Test
    @Tag("MyTests")
    void getNameTest(){
        assertTrue(spartan.getName().equals("Harry"));
    }

    //SetName();
    //Attempting to setName() to a name not in the company fails and the name is unchanged (including setting to null)
    //Names over a certain length are not allowed -> Must be shortened

    @Test
    @Tag("MyTests")
    void setNameTest(){
        assumeTrue(!spartan.getName().equals("Barry"));
        spartan.setName("Barry");
        assertTrue(spartan.getName().equals("Barry"));
    }

    //getCourse();
    //Course must be on a list of approved courses (enumerated values)

    @Test
    @Tag("MyTests")
    void getCourse(){
        assertTrue(spartan.getCourse().equals("Java"));
    }

    //setCourse();
    //Course must be on a list of approved courses (enumerated values)
    //New Course cannot be null
    @Test
    @Tag("MyTests")
    void setCourse(){
        assumeFalse(spartan.getCourse().equals("C++"));
        spartan.setCourse("C++");
        assertTrue(spartan.getCourse().equals("C++"));
    }

    //getStartDate;
    //Can never be null (Someone who never started is not a spartan)
    @Test
    @Tag("MyTests")
    void getStartDateTest(){
        assertTrue(spartan.getStartDate().equals(LocalDate.of(2014,1,1)));
    }

    //setStartDate;
    @Test
    @Tag("MyTests")
    void setStartDateTestPresent(){
        assumeTrue(LocalDate.now().isAfter(spartan.getStartDate()));
        spartan.setStartDate(LocalDate.of(2050,1,1));
        assertTrue(LocalDate.now().isAfter(spartan.getStartDate()));
    }

    @Test
    @Tag("MyTests")
    void setStartDateTestPast(){
        assumeTrue(LocalDate.of(2014,1,1).isBefore(spartan.getStartDate()));
        spartan.setStartDate(LocalDate.of(2050,1,1));
        assertTrue(LocalDate.of(2014,1,1).isBefore(spartan.getStartDate()));
    }





    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " has finished testing");
    }

    @AfterAll
    void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName() + " have all finished testing");
    }
}
