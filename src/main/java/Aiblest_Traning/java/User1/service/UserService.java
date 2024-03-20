package Aiblest_Traning.java.User1.service;

import Aiblest_Traning.java.User1.dto.request.UserRequest;
import Aiblest_Traning.java.User1.dto.response.UserResponse;

public interface UserService {
    UserResponse create(UserRequest request);


}
