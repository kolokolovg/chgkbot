package orf.wff.chgkbot.commands;

import com.google.inject.Inject;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.commands.MessageCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.User;
import orf.wff.chgkbot.services.Emoji;
import orf.wff.chgkbot.services.QuestService;

import static com.pengrad.telegrambot.request.SendMessage.message;

public class GetAnswerCommand extends MessageCommand {
    QuestService rnd;

    @Inject
    public GetAnswerCommand(QuestService randomQuestionService) {
        super("/answer", "get answer");
        this.rnd = randomQuestionService;
    }

    @Override
    public void execute(TelegramBot telegramBot, User user, Chat chat, String s) {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Внимание ответ "+ Emoji.GRINNING_FACE_WITH_SMILING_EYES+": \t\n");
        messageBuilder.append(rnd.getCurrent().getAnswer());
        telegramBot.execute(message(chat,messageBuilder.toString()));

    }
}
