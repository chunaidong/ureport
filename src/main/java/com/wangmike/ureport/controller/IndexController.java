package com.wangmike.ureport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <pre>
 *    @author  : wangchun
 *    @time    : 2020/6/29 9:43
 *    @desc    : 输入描述
 *    @version : v1.0
 * </pre>
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("name","wangshujun");
        return "index";
    }


}
