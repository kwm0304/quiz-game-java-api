package com.quizgame.quizgamejavaapi.service;

import com.quizgame.quizgamejavaapi.exception.UserDoesNotExistException;
import com.quizgame.quizgamejavaapi.exception.UserExistsException;
import com.quizgame.quizgamejavaapi.model.User;
import com.quizgame.quizgamejavaapi.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            logger.error("This address is already in use.");
            throw new UserExistsException("The address:" + user.getEmail() + " is already in use.");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    

    public User findByEmail(String email) throws UserDoesNotExistException {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            logger.error("This email can't be found");
            throw new UserDoesNotExistException("This email can't be found.");
        }
        return user;
    }

    public User updatePassword(User user, String password) throws UserDoesNotExistException{
        user.setPassword(passwordEncoder.encode(password));
        return userRepository.save(user);
    }
}
