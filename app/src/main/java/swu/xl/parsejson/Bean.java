package swu.xl.parsejson;

import java.util.List;

public class Bean {

    /**
     * user : {"id":1000001,"name":"年少醉娇娆","avatar":"http://tp3.sinaimg.cn/5620612798/180/5733537191/0"}
     * title : 请大家帮我掌掌眼~
     * content : 翻箱倒柜，找到40多枚民国铜币，请鉴赏下。
     * images : ["http://ww2.sinaimg.cn/bmiddle/8675fb02gw1exy6fh4lulj20p018gq7m.jpg","http://ww3.sinaimg.cn/bmiddle/8675fb02gw1exy6fhrl3vj20p018g78l.jpg","http://ww2.sinaimg.cn/bmiddle/8675fb02gw1exy6findz0j20p018gn1t.jpg"]
     * block : 古玩鉴赏
     * discussNumber : 101
     * datetime : 2015-12-10 09:40:02
     */

    private UserBean user;
    private String title;
    private String content;
    private String block;
    private String discussNumber;
    private String datetime;
    private List<String> images;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getDiscussNumber() {
        return discussNumber;
    }

    public void setDiscussNumber(String discussNumber) {
        this.discussNumber = discussNumber;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "user=" + user +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", block='" + block + '\'' +
                ", discussNumber='" + discussNumber + '\'' +
                ", datetime='" + datetime + '\'' +
                ", images=" + images +
                '}';
    }

    public static class UserBean {
        /**
         * id : 1000001
         * name : 年少醉娇娆
         * avatar : http://tp3.sinaimg.cn/5620612798/180/5733537191/0
         */

        private int id;
        private String name;
        private String avatar;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        @Override
        public String toString() {
            return "UserBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", avatar='" + avatar + '\'' +
                    '}';
        }
    }
}
