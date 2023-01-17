import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator test;
    @BeforeEach
    public void beforeEach(){
        test = new SumCalculator();
    }
    @Test
    public void sumTest1(){

        //When
        int actual = test.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void sumTest2(){

        //When
        int actual = test.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testThatExceptionsInSumMethodWorksOk() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> test.sum(0));
    }
}
