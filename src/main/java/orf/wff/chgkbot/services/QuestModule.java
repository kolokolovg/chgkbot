package orf.wff.chgkbot.services;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class QuestModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(QuestService.class).to(RandomQuestionService.class).in(Scopes.SINGLETON);
    }
}
