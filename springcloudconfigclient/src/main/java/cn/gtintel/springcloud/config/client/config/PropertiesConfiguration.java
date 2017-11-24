package cn.gtintel.springcloud.config.client.config;

import cn.gtintel.springcloud.config.client.properties.DataDictionaryProperties;
import cn.gtintel.springcloud.config.client.properties.ErrorProperties;
import cn.gtintel.springcloud.config.client.properties.ZookeeperProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfiguration {

    @Bean
    public ZookeeperProperties getZookeeperProperties(){
        return new ZookeeperProperties();
    }

    @Bean
    public ErrorProperties getErrorProperties(){
        return new ErrorProperties();
    }

    @Bean
    public DataDictionaryProperties getDataDictionaryProperties(){
        return new DataDictionaryProperties();
    }

}
