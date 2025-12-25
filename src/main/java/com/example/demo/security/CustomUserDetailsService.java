// package com.example.demo.security;

// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;

// public class CustomUserDetailsService implements UserDetailsService {

//     @Override
//     public UserDetails loadUserByUsername(String username)
//             throws UsernameNotFoundException {
//         return new UserPrincipal(username);
//     }
// }
package com.example.demo.security;

public class CustomUserDetailsService {

    public UserPrincipal loadUserByUsername(String username) {
        return new UserPrincipal(username);
    }
}
