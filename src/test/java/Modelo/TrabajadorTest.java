package Modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest {

    /**
     * Tests the {@code toString} method of the {@code Trabajador} class.
     * This method verifies that the string representation of a {@code Trabajador}
     * instance is formatted as expected, including all necessary attributes.
     */

    @Test
    public void testToString_WithValidData() {
        // Arrange
        Trabajador trabajador = new Trabajador("Juan", "Pérez", "12345678-9", "FONASA", "Habitat");

        // Act
        String actualResult = trabajador.toString();

        // Assert
        String expectedResult = "Nombre: Juan Pérez\n"
                + "RUT: 12345678-9\n"
                + "Isapre: FONASA\n"
                + "AFP: Habitat";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testToString_WithEmptyValues() {
        // Arrange
        Trabajador trabajador = new Trabajador("", "", "", "", "");

        // Act
        String actualResult = trabajador.toString();

        // Assert
        String expectedResult = "Nombre:  \n"
                + "RUT: \n"
                + "Isapre: \n"
                + "AFP: ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testToString_WithNullValues() {
        // Arrange
        Trabajador trabajador = new Trabajador(null, null, null, null, null);

        // Act
        String actualResult = trabajador.toString();

        // Assert
        String expectedResult = "Nombre: null null\n"
                + "RUT: null\n"
                + "Isapre: null\n"
                + "AFP: null";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testToString_WithSpecialCharacters() {
        // Arrange
        Trabajador trabajador = new Trabajador("Élena", "González@", "!@#$%^&", "Fonasa!", "A*F*P");

        // Act
        String actualResult = trabajador.toString();

        // Assert
        String expectedResult = "Nombre: Élena González@\n"
                + "RUT: !@#$%^&\n"
                + "Isapre: Fonasa!\n"
                + "AFP: A*F*P";
        assertEquals(expectedResult, actualResult);
    }
}