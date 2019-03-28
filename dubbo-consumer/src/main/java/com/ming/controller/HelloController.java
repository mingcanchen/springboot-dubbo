package com.ming.controller;

import com.ming.api.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wolter
 */
@RestController
public class HelloController {

    @Reference(version = "${demo.service.version}")
    private IHelloService iHelloService;

    @GetMapping("/say")
    public String saySomething(String name) {

        return  iHelloService.sayHello(name);
    }

}
