import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {

        @Test
        public void testFact2(){
            assertEquals(120, Factorial.calculate(5));
        }
}