package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    public void test_car_properties_junit5() {
        Car car = new Car("Onix", "2017");

        assertNotNull(car);
        assertEquals("Onix", car.getModel());
        assertEquals("2017", car.getYear());
    }

    @Test
    public void test_car_properties_assertJ() {
        Car car = new Car("Onix", "2017");

        assertThat(car).isNotNull().extracting(Car::getYear, Car::getModel).isNotNull()
                .containsSequence("2017", "Onix");

    }

}
