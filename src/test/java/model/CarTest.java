package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("Testing car basic properties with junit5 asserts")
    public void test_car_properties_junit5() {
        Car car = new Car("Onix", "2017");
        assertNotNull(car);
        assertEquals("Onix", car.getModel());
        assertEquals("2017", car.getYear());
    }

    @Test
    @DisplayName("Testing car basic properties with JAssert asserts")
    public void test_car_properties_assertJ() {
        Car car = new Car("Onix", "2017");
        assertThat(car).isNotNull().extracting(Car::getYear, Car::getModel).isNotNull()
                .containsSequence("2017", "Onix");

    }

    protected static Stream<Arguments> validCars() {
        return Stream.of(Arguments.of("Onix Premier", "2020"), Arguments.of("Onix Premier", "2019"),
                Arguments.of("Onix Premier", "2021"));
    }


    @ParameterizedTest(name = "Testing car properties Model: {0}, Year: {1} with source method")
    @MethodSource("validCars")
    public void test_car_properties_with_source_method(String model, String year) {
        Car car = new Car(model, year);
        assertThat(car).isNotNull().extracting(Car::getYear, Car::getModel).containsSequence(year,
                model);
    }



}
