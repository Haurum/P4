//package test;

import org.junit.Test;
import sun.jvm.hotspot.utilities.AssertionFailure;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by haurum on 23/05/2016.
 */
public class MainTest {

    @Test(expected=java.lang.Error.class)
    public void doubleFunction() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/DoubleFunctionName"};
            mainfunc.main(argument);
        } catch (IOException e) {
            System.out.print("Test test");
            e.getMessage();
        }
    }

    @Test
    public void sameActionFunctionName() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/SameActionFunctionName"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void additionNumString() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/AdditionNumString"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test(expected=java.lang.Error.class)
    public void subtractionNumString() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/SubtractionNumString"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void andSuccess() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/And"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test(expected=java.lang.Error.class)
    public void andFailure() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/AndFailure"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test(expected=java.lang.Error.class)
    public void assignDeclarationFailure() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/AssignDeclarationFailure"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected=java.lang.Error.class)
    public void assignTypeFailure() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/AssignTypeFailure"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void assignSuccess() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/AssignSuccess"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void scopeVarSuccess() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/ScopeSuccess"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = java.lang.Error.class)
    public void scopeVarFailure() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/ScopeFailure"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = java.lang.Error.class)
    public void paramsScope() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/ParamsScope"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = java.lang.Error.class)
    public void wrongParams() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/WrongParams"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = java.lang.Error.class)
    public void tooFewParams() {
        try {
            Main mainfunc = new Main();
            String[] argument = new String[] {"testrobots/TooFewParams"};
            mainfunc.main(argument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void tooManyParams() throws IOException {
        Main mainfunc = new Main();
        String[] argument = new String[] {"testrobots/TooManyParams"};
        mainfunc.main(argument);
    }

    @Test(expected = java.lang.Error.class)
    public void functionNotDeclared() throws IOException {
        Main mainfunc = new Main();
        String[] argument = new String[] {"testrobots/FuncNotDeclared"};
        mainfunc.main(argument);
    }

    @Test(expected = java.lang.Error.class)
    public void eventEventhandlerMismatch() throws IOException {
        Main mainfunc = new Main();
        String[] argument = new String[] {"testrobots/EventEventhandlerMismatch"};
        mainfunc.main(argument);
    }
}