import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by haurum on 23/05/2016.
 */
public class MainTest {
    @Test
    public void doubleFunction() {
        try {
            String[] argument = new String[] {"/testrobots/DoubleFunctionName"};
            Main.main(argument);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void evaluatesExpression() {

    }

}