package com.wollo.baiweiserver.service;

import com.wollo.baiweiserver.mapper.FoodMapper;
import com.wollo.baiweiserver.pojo.Food;
import com.wollo.baiweiserver.pojo.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    FoodMapper foodMapper;
    public RespPageBean getFoodByPage(Integer page, Integer size) {
        if (page!=null && size!=null){
            page=(page-1)*size;
        }
        List<Food> list = foodMapper.getFoodByPage(page, size);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(list);
        respPageBean.setTotal(foodMapper.getTotal());
        return respPageBean;
    }
}
