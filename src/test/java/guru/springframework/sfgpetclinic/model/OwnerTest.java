package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest implements ModelTests {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "Igor", "Fraga");
        owner.setCity("São Paulo");
        owner.setTelephone("+5519981351208");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Igor", owner.getFirstName(), "First Name Failed"),
                        () -> assertEquals("Fraga", owner.getLastName(), "Last Name Failed")),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("São Paulo", owner.getCity(), "City Name Failed"),
                        () -> assertEquals("+5519981351208", owner.getTelephone(), "Phone Number Failed"))
        );

        //using Hamcrest
        assertThat(owner.getCity(), is("São Paulo"));
    }

    @RepeatedTest(2)
    void name() {

    }
}