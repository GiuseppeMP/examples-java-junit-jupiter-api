package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarJunit5() {
        Car car = new Car("Onix", "2017");
        assertNotNull(car);
        assertEquals("Onix", car.getModel());
        assertEquals("2017", car.getYear());
    }

    @Test
    public void testCarAssertJ() {
        Car car = new Car("Onix", "2017");
        assertThat(car).isNotNull().extracting("year", "model").isNotNull().contains("2017",
                "Onix");
    }

}
