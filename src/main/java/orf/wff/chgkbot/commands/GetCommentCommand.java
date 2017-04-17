package orf.wff.chgkbot.commands;

import com.google.inject.Inject;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.commands.MessageCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.User;
import orf.wff.chgkbot.services.Emoji;
import orf.wff.chgkbot.services.QuestService;

import static com.pengrad.telegrambot.request.SendMessage.message;

public class GetCommentCommand extends MessageCommand {
    QuestService rnd;

    @Inject
    public GetCommentCommand(QuestService randomQuestionService) {
        super("/comment", "get answer");
        this.rnd = randomQuestionService;
    }

    @Override
    public void execute(TelegramBot telegramBot, User user, Chat chat, String s) {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Комментарий к вопросу: "+ Emoji.AMBULANCE+": \t\n");
        messageBuilder.append(rnd.getCurrent().getComments());
        telegramBot.execute(message(chat,messageBuilder.toString()));

    }
}
