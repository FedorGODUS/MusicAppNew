package MusicApp.service;

import lombok.RequiredArgsConstructor;
import MusicApp.model.User;
import org.springframework.stereotype.Service;
import MusicApp.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findUser(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

}
