package orf.wff.chgkbot.commands;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.commands.MessageCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.User;

import static com.pengrad.telegrambot.request.SendMessage.message;

public class HelpCommand extends MessageCommand {
    public HelpCommand() {
        super("/help", "Список доступных команд");
    }

    @Override
    public void execute(TelegramBot bot, User user, Chat chat, String params) {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Список доступных комманд: \t\n");
        messageBuilder.append("/get - получить вопрос \t\n");
        messageBuilder.append("/answer - получить ответ на текущий вопрос \t\n");
        messageBuilder.append("/comment - получить комментарии к ответу \t\n");
        bot.execute(message(chat, messageBuilder.toString()));
    }
}
