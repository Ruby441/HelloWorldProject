import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, world!", hello.sayHello());
    }
}