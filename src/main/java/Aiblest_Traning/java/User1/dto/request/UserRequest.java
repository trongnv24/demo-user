package Aiblest_Traning.java.User1.dto.request;

public class UserRequest {
    private  String name;
    private  String password;
    private  String lastname;

    public UserRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
