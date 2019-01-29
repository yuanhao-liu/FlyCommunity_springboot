package com.neusoft.controller;

import com.neusoft.domain.LearnResouce;
import com.neusoft.mapper.LearnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @Autowired
    LearnMapper learnMapper;

    @RequestMapping("hello")
    public ModelAndView hello(){
        LearnResouce learnResouce = new LearnResouce();
        learnResouce.setAuthor("lisi");
        learnMapper.add(learnResouce);

        ModelAndView modelAndView = new ModelAndView("cat");
        modelAndView.addObject("hi","hello cat");
        return modelAndView;
    }
}
