import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class unitTest {
    @Test
    public void additionTest(){
        assertEquals(8,Calculation.addition(4,4));
    }
    @Test
    public void subtractionTest(){
        assertEquals(8,Calculation.subtraction(10,2));
    }
    @Test
    public void multiplicationTest(){
        assertEquals(16,Calculation.multiplication(4,4));
    }
    @Test
    public void divisionTest(){
        assertEquals(5,Calculation.division(25,5));
    }
}
