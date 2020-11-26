package dfrz.Day1123;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/23 9:49
 * 描述:
 */
public class User {
    public Integer id;
    public String userName;

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
