package com.study.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
    @RequestMapping(value = "/board/form", method = RequestMethod.GET) // url로 들어오면 GET
    public String form(){
        return "/WEB-INF/views/board/form.jsp";
    }
    
    @RequestMapping(value = "/board/form", method = RequestMethod.POST) // form의 method가 POST기 때문에 여기로 옴
    public String formPost(){
        // insert biz : 저장이 되는 로직이 들어갈 예정
        return "/WEB-INF/views/board/list.jsp";
    }
    
}
