package com.pys.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: PYS
 * @Date: 2019/09/10/0010
 * @Description: com.pys.web.controller
 * @version: 1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public  String showPage(@PathVariable String page){
        return page;
    }
}
