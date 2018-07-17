import dbhelper.DbSwitcher;


import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Properties;


public class KafkaConsumer {
    private final static String TOPIC = "test";
    private final static String BOOTSTRAP_SERVER = "localhost:9092";

    private static Consumer<Long,String> createConsumer(){
        final Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,BOOTSTRAP_SERVER);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, )

    }
    public static void main(String[] args){
       /* DbSwitcher dbSwitcher = new DbSwitcher();
        dbSwitcher.select_db("CASS");
        dbSwitcher.insert(1523,1235568);
        dbSwitcher.insert(1524,1458965);
        dbSwitcher.insert(1525,2559895);
        dbSwitcher.insert(1525,1559895);
        dbSwitcher.close();*/
    }

}
