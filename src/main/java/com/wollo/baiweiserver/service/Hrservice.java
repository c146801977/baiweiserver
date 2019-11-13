package com.wollo.baiweiserver.service;

import com.wollo.baiweiserver.mapper.HrMapper;
import com.wollo.baiweiserver.pojo.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Hrservice implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr =hrMapper.loadUserByUsername(username);
        if (hr == null){
            throw new UsernameNotFoundException("用户不存在！");
        }
        hr.setRoles(hrMapper.getRolesByHrId(hr.getId()));
        return hr;
    }
}
