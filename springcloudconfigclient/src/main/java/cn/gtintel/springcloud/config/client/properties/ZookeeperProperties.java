package cn.gtintel.springcloud.config.client.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("zoo")
public class ZookeeperProperties {

    private String[] hosts;

    private int port;

    private String username;

    public String[] getHosts() {
        return hosts;
    }

    public void setHosts(String[] hosts) {
        this.hosts = hosts;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

}
