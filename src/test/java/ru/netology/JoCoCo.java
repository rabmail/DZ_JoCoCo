package ru.netology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        JaCoCo.StatisticsService service = new JaCoCo.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax100() {
        JaCoCo.StatisticsService service = new JaCoCo.StatisticsService();

        long[] incomesInBillions = {0, 1, 5};  //условие сработает на 0
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}