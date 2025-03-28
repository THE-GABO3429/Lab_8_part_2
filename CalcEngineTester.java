/**
 * 22)A test of subtraction and addition wich then says the results passed | Not really
 * 23)1 | no | 7 | from the thest plus method alone, it should always give the same anser of 7
 * 24)is starts a 5, then goes to -13 and stays there
 * 25)noooooo????
 * 26)I don't understand
 * 27)what?
 * 28)Still nothin
 * 29)what walkthrough are you talking about!?!?
 * 30)i don't know, it would give 6 and I guess the engine would have worked properly
 */







/**
 * Test the CalcEngine class.
 * 
 * @author Hacker T. Largebrain 
 * @version 1.0
 */
public class CalcEngineTester
{
    // The engine to be tested.
    private CalcEngine engine;

    /**
     * Constructor for objects of class CalcEngineTester
     */
    public CalcEngineTester()
    {
        engine = new CalcEngine();
    }
    
    /**
     * Test everything.
     */
    public void testAll()
    {
        System.out.println("Testing the addition operation.");
        System.out.println("The result is: " + testPlus());
        System.out.println("Testing the subtraction operation.");
        System.out.println("The result is: " + testMinus());
        System.out.println("All tests passed.");
    }

    /**
     * Test the plus operation of the engine.
     * @return the result of calculating 3+4.
     */
    public int testPlus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the key presses: 3 + 4 =
        engine.numberPressed(3);
        engine.plus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 7.
        return engine.getDisplayValue();
    }

    /**
     * Test the minus operation of the engine.
     * @return the result of calculating 9 - 4.
     */
    public int testMinus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the presses: 9 - 4 =
        engine.numberPressed(9);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 5.
        return engine.getDisplayValue();
    }
}
