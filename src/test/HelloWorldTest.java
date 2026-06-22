import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testAdd() {
        assertEquals(5, HelloWorld.add(2, 3));
    }
}
