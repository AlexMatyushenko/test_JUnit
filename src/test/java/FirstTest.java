import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTest {
    String actual = null;

    @Before
    public void setup()
    {
        actual = "qwerty";
    }

    @After
    public void teardown() {
    }

    @Test
    public void myFirstTest() {
        String expected = "qwerty";
        assertEquals(expected, actual);
    }
    @Test
    public void myMethodTest(){
        MyClass myClass = new MyClass();
        int expected = 3;
        int actual = myClass.myMethod(3);
        assertEquals(expected, actual);
        assertEquals(1>0,actual>0);
    }
}
