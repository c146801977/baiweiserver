package com.wollo.baiweiserver.config;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import java.util.Collection;


@Component
public class MyAccessData implements AccessDecisionManager {
    /**
     *
     * @param authentication 当前登录的用户对象
     * @param o FilterInvocation
     * @param collection 请求所需要的角色
     * @throws AccessDeniedException
     * @throws InsufficientAuthenticationException
     */
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        for (ConfigAttribute configAttribute : collection) {
            String attribute = configAttribute.getAttribute();
            if ("ROLE_LOGIN".equals(attribute)){
                if (authentication instanceof UsernamePasswordAuthenticationToken){
                    return;
                }else{
                    throw new AccessDeniedException("权限不足，访问失败");
                }
            }

            /*String url = ((FilterInvocation) o).getRequestUrl();
            if ("/login_p".equals(url)){
                return;
            }*/
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            for (GrantedAuthority authority : authorities) {
                if (authority.getAuthority().equals(attribute)){
                    return;
                }
            }
        }
        throw new AccessDeniedException("权限不足，访问失败");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
