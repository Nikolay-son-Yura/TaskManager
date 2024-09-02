package ru.gb.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.user.model.User;
import ru.gb.user.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public Optional<User> findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

}
