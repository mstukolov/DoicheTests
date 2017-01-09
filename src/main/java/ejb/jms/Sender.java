package ejb.jms;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

/**
 * Created by Maxim on 13.12.2016.
 */
public class Sender {

    @Resource(lookup = "jms/ConnectionFactory")
    private static ConnectionFactory connectionFactory;

    public static void main(String[] args) throws JMSException {
        Context context = getInitialContext();
        Connection connection = connectionFactory.createConnection();
    }

    public static Context getInitialContext(){
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
        props.put(Context.URL_PKG_PREFIXES, "com.sun.enterprise.naming");
        props.put(Context.PROVIDER_URL, "http://localhost:4848/");

        InitialContext initialContext = null;
        try {
            initialContext = new InitialContext(props);
        }catch (Exception ex){
            System.out.println(ex);
        }
        return initialContext;
    }
}
