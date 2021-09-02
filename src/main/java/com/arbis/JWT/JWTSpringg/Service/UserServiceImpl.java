package com.arbis.JWT.JWTSpringg.Service;


import com.arbis.JWT.JWTSpringg.domain.Role;
import com.arbis.JWT.JWTSpringg.domain.User;
import com.arbis.JWT.JWTSpringg.repository.RoleRepository;
import com.arbis.JWT.JWTSpringg.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;
    private final RoleRepository roleRepo;

    @Override
    public User saveUser(User user) {
        log.info("Saving user");
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving role");
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Saving role {} to user {}",roleName,username);
        User user = userRepo.findByUsername(username);
      Role role = roleRepo.findByName(roleName);
      user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Getting user");
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("All users");
        return userRepo.findAll();
    }
}
