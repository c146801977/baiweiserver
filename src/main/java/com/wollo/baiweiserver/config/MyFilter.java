package com.wollo.baiweiserver.config;

import com.wollo.baiweiserver.pojo.Menu;
import com.wollo.baiweiserver.pojo.Role;
import com.wollo.baiweiserver.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

@Component
public class MyFilter implements FilterInvocationSecurityMetadataSource {
    @Autowired
    MenuService menuService;
    AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String url = ((FilterInvocation)o).getRequestUrl();//获取请求地址
        List<Menu> allMenus = menuService.getAllMenus();
        for (Menu menu : allMenus) {
            if (antPathMatcher.match(menu.getUrl(),url)){
                List<Role> roles = menu.getRoles();
                String[] strArr =new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    strArr[i]=roles.get(i).getName();
                }
                return SecurityConfig.createList(strArr);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
