package com.example.demo.controller;

import com.example.demo.service.MainService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController("/")
public class MainController {

  @Autowired
  MainService mainService;

  @GetMapping("/all")
  public List<Map<String,Object>> selectAllData(HttpServletRequest request, Model model) throws Exception{
    return mainService.selectAlldata();
  }

  @GetMapping("/drink")
  public List<Map<String,Object>> selectNameData(HttpServletRequest request, @RequestParam Map<String,Object> param, Model model) throws Exception{
    return mainService.selectNameData(param);
  }



}
