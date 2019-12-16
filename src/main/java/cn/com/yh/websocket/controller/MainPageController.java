package cn.com.yh.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yangheng
 * @Classname MainPageController
 * @Description TODO
 * @Date 2019/12/16 17:23
 * @group smart video north
 */
@Controller
public class MainPageController {
    @GetMapping("/ws")
    public String getView(){
        return "ws";
    }
}
