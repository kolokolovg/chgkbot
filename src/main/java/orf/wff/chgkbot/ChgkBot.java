package orf.wff.chgkbot;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.listeners.HandlersChainListener;
import com.pengrad.telegrambot.listeners.handlers.UpdateHandler;
import com.pengrad.telegrambot.model.Update;
import okhttp3.OkHttpClient;
import orf.wff.chgkbot.commands.GetAnswerCommand;
import orf.wff.chgkbot.commands.GetQuestionCommand;
import orf.wff.chgkbot.commands.HelpCommand;
import orf.wff.chgkbot.services.QuestModule;
import orf.wff.chgkbot.services.RandomQuestionService;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Properties;

public class ChgkBot {
    public static void main(String[] args) throws IOException {
        final TelegramBot bot;
        Injector injector = Guice.createInjector(new QuestModule());
        RandomQuestionService randomQuestionService = injector.getInstance(RandomQuestionService.class);
        Properties properties = new Properties();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("local.properties");
        properties.load(is);
        String token = properties.getProperty("TOKEN");
        String proxyaddr = properties.getProperty("PROXY_IP");
        Integer proxyport = Integer.parseInt(properties.getProperty("PROXY_PORT"));
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyaddr, proxyport));
        OkHttpClient.Builder builder = new OkHttpClient.Builder().proxy(proxy);
        OkHttpClient client = builder.build();
        bot = TelegramBotAdapter.buildCustom(token, client);
        final UpdateHandler[] handlers = updateHandlers(randomQuestionService);
        bot.setUpdatesListener(new HandlersChainListener(bot, new UpdateHandler() {
            public boolean handle(TelegramBot bot, Update update) {
                //bot.execute(message(update.message().chat(), Emoji.CONSTRUCTION_SIGN.toString()));
                return true;
            }
        }, handlers));
    }

    private static UpdateHandler[] updateHandlers(RandomQuestionService randomQuestionService) {

        return new UpdateHandler[]{new HelpCommand(),
                new GetQuestionCommand(randomQuestionService),
                new GetAnswerCommand(randomQuestionService)};
    }
}
