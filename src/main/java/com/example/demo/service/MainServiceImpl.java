package com.example.demo.service;

import com.example.demo.mapper.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MainServiceImpl implements MainService{

  @Autowired
  MainMapper mainMapper;

  @Override
  public List<Map<String, Object>> selectAlldata(){
    return mainMapper.getAlldata();
  }

  @Override
  public List<Map<String, Object>> selectNameData(Map<String, Object> param){
    List<Map<String,Object>> resultMap = new ArrayList<>();
    resultMap=mainMapper.getNameData(param);

    return resultMap;
  }

}
