package cn.gtintel.springcloud.config.client.controller;

import cn.gtintel.springcloud.config.client.properties.DataDictionaryProperties;
import cn.gtintel.springcloud.config.client.properties.ErrorProperties;
import cn.gtintel.springcloud.config.client.properties.ZookeeperProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/test"}, method = {RequestMethod.GET})
public class TestController {

    private ZookeeperProperties zookeeperProperties;
    private ErrorProperties errorProperties;
    private DataDictionaryProperties dataDictionaryProperties;

    public TestController(ZookeeperProperties zookeeperProperties, ErrorProperties errorProperties,
                          DataDictionaryProperties dataDictionaryProperties){
        this.zookeeperProperties = zookeeperProperties;
        this.errorProperties = errorProperties;
        this.dataDictionaryProperties = dataDictionaryProperties;
    }

    @RequestMapping(path = "/zookeeper")
    public ZookeeperProperties getZookeeperProperties() {
        return this.zookeeperProperties;
    }

    @RequestMapping(path = "/error")
    public ErrorProperties getErrorProperties() {
        return this.errorProperties;
    }

    @RequestMapping(path = "/dataDictionary")
    public DataDictionaryProperties getDataDictionaryProperties() {
        return this.dataDictionaryProperties;
    }

}
