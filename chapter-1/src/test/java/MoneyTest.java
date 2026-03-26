import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    @DisplayName("test multiplication")
    public void testMultiplication(){
        Money five = new Money(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
