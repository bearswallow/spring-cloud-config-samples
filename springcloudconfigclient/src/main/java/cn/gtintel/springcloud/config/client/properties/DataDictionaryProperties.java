package cn.gtintel.springcloud.config.client.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties("data.dictionary")
public class DataDictionaryProperties {

    private Map<String, DictionaryItem> items;

    public Map<String, DictionaryItem> getItems() {
        return items;
    }

    public void setItems(Map<String, DictionaryItem> items) {
        this.items = items;
    }

    public static class DictionaryItem{
        private String name;

        private String description;

        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

}
