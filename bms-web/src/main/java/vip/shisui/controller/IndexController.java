package vip.shisui.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author dcr_lidwc
 */
@Controller
public class IndexController {
//    public String index(){
//        return "index";
//    }

    @GetMapping("/{url}")
    public String url(@PathVariable String url){
        return url;
    }
}
