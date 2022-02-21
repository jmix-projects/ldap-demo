package com.company.ldapdemo.app;

import com.company.ldapdemo.entity.User;
import io.jmix.ldap.userdetails.AbstractLdapUserDetailsSynchronizationStrategy;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.stereotype.Component;

@Component("l_CustomUserSynchronizationStrategy")
public class CustomUserSynchronizationStrategy extends AbstractLdapUserDetailsSynchronizationStrategy<User> {
    @Override
    protected Class<User> getUserClass() {
        return User.class;
    }

    @Override
    protected void mapUserDetailsAttributes(User userDetails, DirContextOperations ctx) {
        userDetails.setFirstName(ctx.getStringAttribute("givenName"));
        userDetails.setLastName(ctx.getStringAttribute("sn"));
    }
}