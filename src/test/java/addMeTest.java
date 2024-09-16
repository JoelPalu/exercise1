import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class addMeTest {

    App app = new App();

    @Test
    public void addMeTest(){
        assertEquals(5.0, app.addMe(2, 3), 0);
    }

    @Test
    public void subMeTest(){
        assertEquals(2.0, app.subMe(5, 3), 0);
    }
}
