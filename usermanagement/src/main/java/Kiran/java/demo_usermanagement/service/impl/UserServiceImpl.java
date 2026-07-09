package Kiran.java.demo_usermanagement.service.impl;

import Kiran.java.demo_usermanagement.dto.UserDTO;
import Kiran.java.demo_usermanagement.entity.User;
import Kiran.java.demo_usermanagement.mapper.UserMapper;
import Kiran.java.demo_usermanagement.repository.UserRepository;
import Kiran.java.demo_usermanagement.service.UserService;
import org.springframework.stereotype.Service;


@Service

public class UserServiceImpl  implements UserService {

    private final UserRepository userRepository;
    private UserMapper userMapper = null;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper){
        this.userRepository = userRepository;
//        this.userMapper = userMapper;
        this.userMapper = userMapper;


    }
    @Override
    public UserDTO createUser(UserDTO userDTO) {
      User user =  userMapper.toEntity(userDTO);

      User savedUser = userRepository.save(user);
        return userMapper.toDTO(savedUser);
    }
}
