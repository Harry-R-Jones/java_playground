package additional_junit.mockito;

import additional_junit.Spartan;
import additional_junit.SpartanRepository;
import jdk.vm.ci.meta.Local;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.fail;

public class SpartanRepositoryTests {

    private Spartan mockSpartan;
    private Spartan manish;

    @BeforeEach
    void setUp() {
        mockSpartan = Mockito.mock(Spartan.class);
        manish = new Spartan(1, "Manish", "Java", LocalDate.now());
    }

    @Test
    @DisplayName("Mocking a spartan")
    void mockingASpartan() {
        SpartanRepository.addSpartan(mockSpartan);

        Mockito.when(mockSpartan.toString()).thenReturn("Found Mock Spartan");
        Mockito.doThrow(NullPointerException.class).when(mockSpartan).setId(Mockito.anyInt());

        Assertions.assertEquals("Found Spartan" + "\n", SpartanRepository.getAllSpartans());
    }

    @Test
    @DisplayName("Chain Method calls with a mock")
    void chainMethodCallsWithAMock() {
        Mockito.when(mockSpartan.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.MAX);
    }

    @Test
    @DisplayName("Using a spy")
    void usingASpy() {
        Spartan spyManish = Mockito.spy(manish);
        Mockito.when(spyManish.getName()).thenCallRealMethod();
    }
}
