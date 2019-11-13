package com.wollo.baiweiserver.controller.system.basic;

import com.wollo.baiweiserver.pojo.Department;
import com.wollo.baiweiserver.pojo.RespBean;
import com.wollo.baiweiserver.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/system/basic/dep")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepsByPid() {
        return departmentService.getAllDepsByPid();
    }

    @PostMapping("/")
    public RespBean addDep(@RequestBody Department department) {
        departmentService.addDep(department);
        if (department.getResult() == 1) {
            return RespBean.ok("添加成功", department);
        }
        return RespBean.error("添加失败");
    }
}
