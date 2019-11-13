package com.wollo.baiweiserver.service;

import com.wollo.baiweiserver.mapper.MenuMapper;
import com.wollo.baiweiserver.pojo.Hr;
import com.wollo.baiweiserver.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    public List<Menu> getAllMenusByHrId() {
        return menuMapper.getAllMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    public List<Menu> getAllMenus(){
        return menuMapper.getAllMenus();
    }

    public List<Menu> getAllMenusByPid() {
        return menuMapper.getAllMenusByPid(-1);
    }

    public List<Integer> getMidByRid(Integer rid) {
        return menuMapper.getMidByRid(rid);
    }
}
