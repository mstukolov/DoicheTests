import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maxim on 28.11.2016.
 */
public class JUnitTest {

    @Test
    public void testCalB() {
       /* Calculate c = new Calculate();
        assertEquals("10 x 5 must be 50", 6, c.calA(2, 3));*/
    }
    @Test
    public void testCalA() {
        // Тестируемый класс
        /*Calculate c = new Calculate();
        assertEquals("10 x 5 must be 50", 5, c.calA(1, 5));
        assertEquals("10 x 5 must be 50", 5, c.calA(5, 1));
        assertEquals("10 x 5 must be 50", 30, c.calA(6, 5));*/


        // Проверяемый метод
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals("10 x 5 must be 50", 5, c.calA(i, j));
            }
        }*/

    }
    @Test(expected = ConcurrentModificationException.class)
    public void testForEachFail() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("a", "a");
        map.put("b", "b");

        for(String key:map.keySet()) {
            map.remove(key);
        }
    }
}
