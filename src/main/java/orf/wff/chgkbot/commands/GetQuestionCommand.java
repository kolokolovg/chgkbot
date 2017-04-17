package orf.wff.chgkbot.commands;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.commands.MessageCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.User;
import orf.wff.chgkbot.services.RandomQuestionService;

import static com.pengrad.telegrambot.request.SendMessage.message;

public class GetQuestionCommand extends MessageCommand {
    public GetQuestionCommand() {
        super("/get", "get question");
    }

    @Override
    public void execute(TelegramBot telegramBot, User user, Chat chat, String s) {
        StringBuilder messageBuilder = new StringBuilder();
        RandomQuestionService randomQuestionService = new RandomQuestionService();
        messageBuilder.append("Внимание вопрос: ");
        messageBuilder.append(randomQuestionService.getRandomQuestion().getQuestion());
        telegramBot.execute(message(chat,messageBuilder.toString()));

    }
}
