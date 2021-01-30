package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoCoCoTest {

    @Test
    void findMax() {
        JaCoCo service = new JaCoCo();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax100() {
        JaCoCo service = new JaCoCo();

        long[] incomesInBillions = {0, 1, 5};  //условие сработает на 0
        long expected = 5;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
