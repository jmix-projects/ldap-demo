# LDAP Jmix Addon Demo application

-----
This demo application demonstrates the usage of LDAP [Jmix](https://github.com/Haulmont/jmix-ldap) add-on.

-----
## Sample data

This demo project contains configuration for test LDAP server ldap://ldap.forumsys.com:389

User `admin` can login without LDAP authentication

Available LDAP group and users: 
- `mathematicians` 
  - riemann
  - gauss
  - euler
  - euclid
- `scientists`
  - einstein
  - newton
  - galieleo
  - tesla

Default user password: password

--------------------------------

**Used database**: PostgreSQL

Credentials are placed in `application.properties`

--------------------------------

### User mapping

After first login LDAP user has been saved to database with following mapped credentials: 

- username
- password
- first name
- last name
- email

--------------------------------

### Role mapping

`ui-minimal` role will be added to all logged in LDAP users 

Following roles will be added to logged in LDAP users with `mathematicians` group:

- `Mathematicians resource role`
- `Mathematicians row-level role`

Users are allowed to log in and open LDAP Mathematicians screen

Following roles will be added to logged in LDAP users with `scientists` group

- `Scientists resource role`
- `Scientists row-level role`

Users are allowed to log in and open LDAP Scientists screen