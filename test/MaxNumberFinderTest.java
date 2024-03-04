import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class MaxNumberFinderTest {

    private final long number;
    private final int expectedMaxNumber;

    public MaxNumberFinderTest(long number, int expectedMaxNumber) {
        this.number = number;
        this.expectedMaxNumber = expectedMaxNumber;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {451212342, 5},
                {987654321, 9},
                {123456789, 9},
                {00000, 0}, //При вводе нуля макс число тоже будет 0
                {-12345, 5}, // Ввод отрицательного числа
                {3131312, 3}, 
                {999999999, 9}, 
                {99999999923131312L, 9}, // Проверяем очень большое число
        });
    }

    @Test
    public void testFindMaxNumber() {
        assertEquals(expectedMaxNumber, findMaxNumber.findMaxNumber(number));
    }
}


