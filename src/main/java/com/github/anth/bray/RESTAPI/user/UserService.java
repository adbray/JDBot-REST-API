package com.github.anth.bray.RESTAPI.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    public void updateUser(Long id, String name){
        //Increment post count for user
        if(userRepository.existsById(id)){
            User user = getUser(id);
            user.setExp(user.getExp() + 1);
            userRepository.save(user);
        }
        else{
            userRepository.save(new User(id, name));
        }
    }
}
