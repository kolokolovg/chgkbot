import orf.wff.chgkbot.services.RandomQuestionService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RandomQuestionServiceInitTest {
    @Test
    public void initsize(){
        RandomQuestionService rqs = new RandomQuestionService();
        assertEquals( rqs.getQuestions().question.getQuestion().size(),24);
    }
}
