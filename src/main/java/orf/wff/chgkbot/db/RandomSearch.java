package orf.wff.chgkbot.db;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Properties;

public class RandomSearch {
    private int total;
    private int current;
    public Search question;
    public Question getNextRandomQuestion(){
        if (current==total) {
            init();
            this.total = this.question.getQuestion().size();
            this.current = 0;
        }
        return question.getQuestion().get(current++);
    };

    public RandomSearch() {
        if(init()){
            this.total = this.question.getQuestion().size();
            this.current = 0;
        };

    }

    private boolean init(){
        try {
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
            Request request = new Request.Builder()
                    .url("http://db.chgk.info/xml/random")
                    .build();
            Response response = client.newCall(request).execute();
            String ppp = response.body().string();
            JAXBContext jc =JAXBContext.newInstance(Search.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            StringReader reader = new StringReader(ppp);
            this.question = (Search) unmarshaller.unmarshal(reader);
            System.out.println(" rs constructor search size = "+this.question.getQuestion().size());
                    //
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;}
            finally {
            return true;
        }
    }

    @Override
    public String toString() {
        return "ClassPojo [total = " + total + ", question = " + question + "]";
    }
}