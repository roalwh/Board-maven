package com.example.demo.service;

import com.example.demo.mapper.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface MainService {
  public List<Map<String, Object>> selectNameData(Map<String, Object> param);

  public List<Map<String, Object>> selectAlldata();

}
