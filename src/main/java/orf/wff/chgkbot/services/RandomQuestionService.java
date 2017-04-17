package orf.wff.chgkbot.services;

import orf.wff.chgkbot.db.Question;
import orf.wff.chgkbot.db.RandomSearch;

public class RandomQuestionService {
    private RandomSearch questions;

    public RandomSearch getQuestions() {
        return questions;
    }

    public RandomQuestionService() {
        questions = new RandomSearch();
    }

    public Question getRandomQuestion(){
        return  questions.getNextRandomQuestion();
    }
    public void getNewSearch(){
        questions = new RandomSearch();
    }

}
