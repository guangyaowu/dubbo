package com.wuguangyao.message.controller;

import com.wuguangyao.core.service.IDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference
    private IDemoService demoService;

    @GetMapping("/demo")
    public String demo(){
        return demoService.hello();
    }

}
