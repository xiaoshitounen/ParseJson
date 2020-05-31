package swu.xl.parsejson;

public class User {
    public long id;
    public String name;
    public String avatar;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
