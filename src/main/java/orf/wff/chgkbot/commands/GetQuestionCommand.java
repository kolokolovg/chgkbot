package orf.wff.chgkbot.commands;

import com.google.inject.Inject;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.commands.MessageCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.User;
import orf.wff.chgkbot.services.Emoji;
import orf.wff.chgkbot.services.QuestService;

import static com.pengrad.telegrambot.request.SendMessage.message;

public class GetQuestionCommand extends MessageCommand {
    QuestService rnd;

    @Inject
    public GetQuestionCommand(QuestService randomQuestionService) {
        super("/get", "get question");
        this.rnd = randomQuestionService;


    }

    @Override
    public void execute(TelegramBot telegramBot, User user, Chat chat, String s) {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Внимание вопрос " + Emoji.SMILING_CAT_FACE_WITH_OPEN_MOUTH + ": \t\n");
        messageBuilder.append(rnd.getRandomQuestion().getQuestion());
        telegramBot.execute(message(chat, messageBuilder.toString()));

    }
}
