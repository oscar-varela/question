

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ChoiseQuestionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ChoiseQuestionTest
{    private ChoiseQuestion choiseQuestion;
    /**
     * Default constructor for test class ChoiseQuestionTest
     */
    public ChoiseQuestionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    { choiseQuestion = new ChoiseQuestion();
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
    public void testWhitFourAnswers()
    {
        choiseQuestion.setText("what was the original name of the java language");
        choiseQuestion.addChoise("*7",false);
        choiseQuestion.addChoise("Duke",false);
        choiseQuestion.addChoise("Oak",true);
        choiseQuestion.addChoise("Gosling",false);
        assertTrue(choiseQuestion.checkAnswer("3") );
    }
}
