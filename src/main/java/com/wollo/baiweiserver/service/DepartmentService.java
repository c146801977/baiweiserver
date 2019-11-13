package com.wollo.baiweiserver.service;

import com.wollo.baiweiserver.mapper.DepartmentMapper;
import com.wollo.baiweiserver.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    public List<Department> getAllDepsByPid() {
        return departmentMapper.getAllDepsByPid(-1);
    }

    public void addDep(Department department) {
        department.setEnabled(true);
        departmentMapper.addDep(department);
    }
}