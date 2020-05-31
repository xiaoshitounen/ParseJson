package swu.xl.parsejson;

import java.util.ArrayList;
import java.util.List;

public class JsonModel {
    public User user;
    public String title;
    public String content;
    public List<String> images;
    public String block;
    public String discussNumber;
    public String datetime;

    public JsonModel() {
        images = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "JsonModel{" +
                "user=" + user +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", images=" + images +
                ", block='" + block + '\'' +
                ", discussNumber='" + discussNumber + '\'' +
                ", datetime='" + datetime + '\'' +
                '}';
    }
}
