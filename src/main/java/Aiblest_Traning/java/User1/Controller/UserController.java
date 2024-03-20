package Aiblest_Traning.java.User1.Controller;

import Aiblest_Traning.java.User1.dto.request.UserRequest;
import Aiblest_Traning.java.User1.dto.response.UserResponse;
import Aiblest_Traning.java.User1.service.UserService;;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/uses1")
@Slf4j
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
   @PostMapping()
   @ResponseStatus(HttpStatus.CREATED)
   public UserResponse create(@RequestBody UserRequest request){
        log.info(" === Start api create new user === ");
        log.info(" === Request Body : {} === ", request);
        UserResponse response = service.create(request);
        log.info(" === Finish api create new user, User Id : {} === ", response.getId());
        return response;
   }

}
