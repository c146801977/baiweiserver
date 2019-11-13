package com.wollo.baiweiserver.mapper;

import com.wollo.baiweiserver.pojo.Food;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    List<Food> getFoodByPage(@Param("page") Integer page,@Param("size") Integer size);

    Integer getTotal();
}