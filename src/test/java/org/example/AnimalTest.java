package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getName() {

        Animal rover = new Animal("rover");

        String expected = "rover";

        assertEquals(expected, rover.getName());
    }

    @Test
    void setName() {
        Animal rover = new Animal("Deez");
        rover.setName("Nuts");

        String expected = "Nuts";

        assertEquals(expected, rover.getName());
    }

    @Test
    void getDog() {
        Animal rover = new Animal("Deez",true);

        assertTrue(rover.getDog());
    }

    @Test
    void setDog() {
        Animal rover = new Animal("Deez",true);

        rover.setDog(false);

        assertFalse(rover.getDog());

    }

    @Test
    void testToString() {
        Animal deez = new Animal("nuts",true);

        String expected = "nuts is a dog: true" + "\n";
        String actual = deez.toString();

        assertEquals(expected, actual);

    }
}