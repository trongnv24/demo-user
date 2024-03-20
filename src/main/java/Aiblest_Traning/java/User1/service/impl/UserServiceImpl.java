package Aiblest_Traning.java.User1.service.impl;

import Aiblest_Traning.java.User1.dto.request.UserRequest;
import Aiblest_Traning.java.User1.dto.response.UserResponse;
import Aiblest_Traning.java.User1.entity.UserEntity;
import Aiblest_Traning.java.User1.repository.UserRepository;
import Aiblest_Traning.java.User1.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static Aiblest_Traning.java.User1.service.mapping.UserMapping.convertDtoToEntity;
import static Aiblest_Traning.java.User1.service.mapping.UserMapping.convertEntityToUserResponse;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse create(UserRequest request) {
        log.info(" === Start api create new user === ");
        log.info(" === Request Body : {} === ", request);
        UserEntity entity = convertDtoToEntity(request);
        entity = userRepository.save(entity);
        UserResponse response = convertEntityToUserResponse(entity);
        log.info(" === Finish api create new user, User id : {} === ", response.getId());
        return response;
    }
}
