import com.theironyard.charlotte.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by temp on 12/13/16.
 */
public class MainTest {

    @Test
    public void boost() throws Exception {
        assertEquals(460, Main.boost(359)); // 460
        assertEquals(291, Main.boost(180)); // 291
        assertEquals(000, Main.boost(999)); // 000
        assertEquals(2, Main.boost(1));// 2

    }
}
