package com.wollo.baiweiserver.mapper;

import com.wollo.baiweiserver.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getAllMenusByHrId(Integer hrid);

    List<Menu> getAllMenus();

    List<Menu> getAllMenusByPid(Integer pid);

    List<Integer> getMidByRid(Integer rid);
}