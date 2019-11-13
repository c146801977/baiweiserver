package com.wollo.baiweiserver.controller.system.basic;

import com.wollo.baiweiserver.pojo.Position;
import com.wollo.baiweiserver.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/basic/position")
public class PositionController {
    @Autowired
    PositionService positionService;
    @GetMapping("/")
    public List<Position> getAllPosi(){
        return positionService.getAllPosi();
    }
}
