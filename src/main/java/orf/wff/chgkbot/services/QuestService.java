package orf.wff.chgkbot.services;

import orf.wff.chgkbot.db.Question;

public interface QuestService {
    Question getRandomQuestion();
    Question getCurrent();
}
