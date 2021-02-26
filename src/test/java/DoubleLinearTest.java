import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleLinearTest {
    private DoubleLinear doubleLinear;
    @BeforeEach
    public void setUp(){
        doubleLinear = new DoubleLinear();
    }

    @Test
    public void shoudReturn1(){
        assertEquals(1,doubleLinear.dblLinear(0));
    }
    @Test
    public void shoudReturn22(){
        assertEquals(22,doubleLinear.dblLinear(10));
    }
    @Test
    public void shoudReturn20(){
        assertEquals(57,doubleLinear.dblLinear(20));
    }
    @Test
    public void shoudReturn50(){
        assertEquals(175,doubleLinear.dblLinear(50));
    }

}
