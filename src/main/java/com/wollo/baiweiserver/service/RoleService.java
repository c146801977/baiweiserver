package com.wollo.baiweiserver.service;

import com.wollo.baiweiserver.mapper.RoleMapper;
import com.wollo.baiweiserver.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public List<Role> getAllRoles() {
       return roleMapper.getAllRoles();
    }
}
