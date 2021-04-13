package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
}