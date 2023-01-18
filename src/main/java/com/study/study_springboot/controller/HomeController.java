package com.study.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // MVC모델에서 이 클래스를 컨테이너로 하겠다는 선언
public class HomeController {
    @RequestMapping(value = {"", "/", "main"})
    public String main() {
        int i = 0;
        return  "WEB-INF/views/main.jsp";
    }

    @RequestMapping(value = "/home")
    public void home() {
        int i = 0;
    }
    
    @RequestMapping(value = "/homejsp")    // request. value가 외부에서 들어오는 url => http://localhost:8080/home
    public String homejsp() {
        int i = 0;
        // 컨트롤러에서 뷰로 넘어갈 때는 데이터와 뷰의 파일 이름을 넘겨줘야 함
        return  "WEB-INF/views/home.jsp";   // return을 spring에 전달하면 spring이 뷰를 호출
    }

    @RequestMapping(value = "/homehtml")
    public String homehtml() {
        int i = 0;
        return  "WEB-INF/views/home.html";
        // spring은 html을 해석하지 않기 때문에 html은 화이트페이지 에러가 뜸
        // jasper 때문
    }

}
