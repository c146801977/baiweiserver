package com.wollo.baiweiserver.mapper;

import com.wollo.baiweiserver.pojo.EmployeeTrain;

public interface EmployeeTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeTrain record);

    int insertSelective(EmployeeTrain record);

    EmployeeTrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeTrain record);

    int updateByPrimaryKey(EmployeeTrain record);
}