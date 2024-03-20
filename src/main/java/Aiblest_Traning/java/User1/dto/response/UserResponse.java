package Aiblest_Traning.java.User1.dto.response;

import Aiblest_Traning.java.User1.dto.request.UserRequest;

public class UserResponse extends UserRequest {
    private String id;

    public UserResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                '}';
    }
}
