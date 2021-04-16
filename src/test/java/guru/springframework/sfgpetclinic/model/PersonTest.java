package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("model")
class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1L, "Igor", "Fraga");

        //then
        assertAll("Test Props Set",
                () -> assertEquals("Igor", person.getFirstName()),
                () -> assertEquals("Fraga", person.getLastName()));
    }

    @Test
    void groupedAssertionsFail() {
        //given
        Person person = new Person(1L, "Igor", "Fraga");

        //then
        assertAll("Test Props Set",
                () -> assertEquals("Igor", person.getFirstName(), "First Name Failed"),
                () -> assertEquals("Fraga", person.getLastName(), "Last Name Failed"));
    }

    @RepeatedTest(value = 10, name = RepeatedTest.DISPLAY_NAME_PLACEHOLDER + " : " + RepeatedTest.CURRENT_REPETITION_PLACEHOLDER + " - " + RepeatedTest.TOTAL_REPETITIONS_PLACEHOLDER)
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        //do nothing
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }
}