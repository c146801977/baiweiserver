package com.wollo.baiweiserver.controller.system.basic;

import com.wollo.baiweiserver.pojo.Menu;
import com.wollo.baiweiserver.pojo.Role;
import com.wollo.baiweiserver.service.MenuService;
import com.wollo.baiweiserver.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {
    @Autowired
    RoleService roleService;
    @Autowired
    MenuService menuService;
    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }
    @GetMapping("/menus")
    public List<Menu> getAllMenusByPid(){
        return menuService.getAllMenusByPid();
    }
    @GetMapping("/mid/{rid}")
    public List<Integer> getMidByRid(@PathVariable Integer rid){
        return menuService.getMidByRid(rid);
    }
}
