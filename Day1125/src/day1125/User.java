package day1125;

/**
 * @author Lihanqin
 * @Description
 * @date 2020-11-25 19:16
 **/
public class User {
    private String suerName;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "suerName='" + suerName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public User(String suerName, String password) {
        this.suerName = suerName;
        this.password = password;
    }

    public String getSuerName() {
        return suerName;
    }

    public void setSuerName(String suerName) {
        this.suerName = suerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
