package com.example.demo.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final Map<String, UserRecord> users = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public UserRecord register(String email, String password, String role) {
        Long id = idGenerator.getAndIncrement();
        UserRecord user = new UserRecord(id, email, password, role);
        users.put(email, user);
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserRecord user = users.get(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }
        return new UserPrincipal(user.getId(), user.getEmail(), user.getPassword(), user.getRole());
    }
}