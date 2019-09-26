

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuestionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuestionTest
{
    private Question question1;

    /**
     * Default constructor for test class QuestionTest
     */
    public QuestionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        question1 = new Question();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test1()
    {
        question1.setText("Quien es el creador de java?");
        question1.setAnswer("James");
        assertTrue(question1.checkAnswer("James"));
        assertFalse(question1.checkAnswer("Richard"));
    }
}

