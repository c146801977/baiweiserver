package com.wollo.baiweiserver.service;

import com.wollo.baiweiserver.mapper.PositionMapper;
import com.wollo.baiweiserver.pojo.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;

    public List<Position> getAllPosi(){
        return positionMapper.getAllPosi();
    }
}
