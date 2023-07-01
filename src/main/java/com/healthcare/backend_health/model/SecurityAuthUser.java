package com.healthcare.backend_health.model;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.healthcare.backend_health.entity.AuthUser;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityAuthUser implements UserDetails {

    @Autowired
    private AuthUser authUser;

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return authUser.getPassword();

    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return authUser.getUsername();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
