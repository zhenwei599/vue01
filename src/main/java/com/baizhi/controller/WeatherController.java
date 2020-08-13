package com.baizhi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@Slf4j
public class WeatherController {
    @GetMapping("/weather/getInfo")
    public Map<String,Object> getWeatherInfo(String cityName){
        log.info("进入controller服务");
        HashMap<String, Object> map = new HashMap<>();
        String info  = getCity(cityName);
        map.put("state",true);
        map.put("msg",info);
        return map;
    }

    public String getCity(String cityName){
        HashMap<String, Object> map = new HashMap<>();
        map.put("北京","北京，今天晴转多云，局部地区有大雨，最高17度！");
        map.put("上海","上海，今天晴转多云，局部地区有大学，最高44度！");
        map.put("郑州","郑州，今天晴转多云，局部地区有有雾，最高4度！");
        map.put("天津","天津，今天晴转多云，局部地区有有雪，最高51度！");
        map.put("武汉","武汉，今天晴转多云，局部地区有晴朗，最高22度！");
        map.put("杭州","杭州，今天晴转多云，局部地区有大雨，最高16度！");
        return (String) map.get(cityName);
    }


}
