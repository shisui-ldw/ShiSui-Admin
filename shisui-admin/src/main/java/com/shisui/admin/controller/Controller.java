package com.shisui.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: ShiSui-MS
 * @package: com.shisui.admin
 * @className: Controller
 * @author: lidongwei
 * @description: TODO
 * @date: 2023/7/6 10:52
 * @version: 1.0
 */
@RestController
public class Controller {

    @GetMapping("/index")
    public String index(){
        return "hello world";
    }
}
