package com.wollo.baiweiserver.controller.food;

import com.wollo.baiweiserver.pojo.RespPageBean;
import com.wollo.baiweiserver.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/food/mana")
public class FoodController {
    SimpleDateFormat simpleDateFormat =new SimpleDateFormat("/yyyy/MM/dd hh:mm:ss");

    @Autowired
    FoodService foodService;
    @GetMapping("/")
    public RespPageBean getFoodByPage(Integer page, Integer size){
        return foodService.getFoodByPage(page,size);
    }
    /*public RespBean updateFood(MultipartFile multipartFile, Food food, HttpServletRequest req){
        //req.getServletContext().getRealPath()
    }*/
}
