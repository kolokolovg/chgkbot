package orf.wff.chgkbot.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import orf.wff.chgkbot.db.Question;
import orf.wff.chgkbot.db.RandomSearch;

@Singleton
public class RandomQuestionService implements QuestService {
    private RandomSearch questions;
    private Question current;

    public RandomSearch getQuestions() {
        return questions;
    }

    @Inject
    public RandomQuestionService() {
        questions = new RandomSearch();
    }

    public Question getRandomQuestion() {
        this.current = questions.getNextRandomQuestion();
        return this.current;
    }

    public Question getCurrent() {
        return current;
    }

    public void getNewSearch() {
        questions = new RandomSearch();
    }

}
