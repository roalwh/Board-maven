package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface MainMapper {
  List<Map<String, Object>> getAlldata();

  List<Map<String,Object>> getNameData(Map<String, Object> param);

}
