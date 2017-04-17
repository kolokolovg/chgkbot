package orf.wff.chgkbot.services;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.Singleton;

public class QuestModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(QuestService.class).to(RandomQuestionService.class).in(Scopes.SINGLETON);
        System.out.println("bind injector call");
    }
}
