import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testRun_SuccessfulAddition_ReturnsCorrectResult() {
        // Arrange - Priprema ulaznih podataka
        String expression = "5+3";
        String expectedResult = "8.0";

        // Act - Izvršavanje metode koja se testira
        String actualResult = Calculator.Run(expression);

        // Assert - Provera da li je dobijeni rezultat jednak očekivanom
        assertEquals(expectedResult, actualResult, "Sabiranje brojeva 5 i 3 bi trebalo da vrati 8.0");
    }
}