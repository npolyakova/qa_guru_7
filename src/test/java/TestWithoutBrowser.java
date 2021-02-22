import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWithoutBrowser {

    int sum = 2 + 2;

    @Test
    public void successOne(){
        assertEquals(sum,4);
    }

    /*@Test
    public void negativeOne(){
        assertEquals(sum,2);
    }*/
}
