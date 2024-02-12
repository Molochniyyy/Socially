package pet.projects.socially.user.service;

import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pet.projects.socially.user.model.User;
import pet.projects.socially.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RegistrationService {
    private final UserRepository userRepository;

    @Transactional
    public void registerUser(String nickname, String password) {
        String salt = BCrypt.gensalt();
        String hashedPassword = BCrypt.hashpw(password, salt);
        userRepository.saveAndFlush(new User(nickname, hashedPassword));
    }
}
