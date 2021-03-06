package ewing.user;

import ewing.application.AppBeans;
import ewing.application.paging.Pager;
import ewing.application.paging.Pages;
import ewing.entity.Permission;
import ewing.entity.User;
import ewing.security.RoleAsAuthority;
import ewing.security.SecurityUser;

import java.math.BigInteger;
import java.util.List;

/**
 * 用户服务接口。
 **/
public interface UserService extends AppBeans {

    User addUser(User user);

    User getUser(BigInteger userId);

    User updateUser(User user);

    Pages<User> findUsers(Pager pager, String name, String roleName);

    void deleteUser(BigInteger userId);

    SecurityUser getByName(String name);

    List<RoleAsAuthority> getUserRoles(BigInteger userId);

    List<Permission> getUserPermissions(BigInteger userId);
}
