package com.company.ldapdemo.app;

import io.jmix.ldap.userdetails.LdapAuthorityToJmixRoleCodesMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component("l_CustomAuthorityMapperBean")
public class CustomAuthorityMapperBean implements LdapAuthorityToJmixRoleCodesMapper {

    @Override
    public Collection<String> mapAuthorityToJmixRoleCodes(String authority) {
        Collection<String> roleCollection = new ArrayList<>();

        roleCollection.add(authority + "-resource-role");
        roleCollection.add(authority + "-row-level-role");

        return roleCollection;
    }
}