import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {
    @Test
    void testMethod() {
        String hello = "hello";
        Assertions.assertEquals("hello", hello);
    }
}
