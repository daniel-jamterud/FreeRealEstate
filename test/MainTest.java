import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    @DisplayName("Beräkna totala priset för en bostad.")
    public void testCalculateTotalPrice(){
        assertEquals(300_000,Main.calculateTotalPrice(30,10_000));
    }


}
