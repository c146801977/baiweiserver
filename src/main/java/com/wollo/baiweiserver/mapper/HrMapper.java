package com.wollo.baiweiserver.mapper;

import com.wollo.baiweiserver.pojo.Hr;
import com.wollo.baiweiserver.pojo.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);

    List<Role> getRolesByHrId(Integer hrId);
}