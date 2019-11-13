package com.ccit.bootswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: boot-swagger-com.ccit.bootswagger.controller-Hello
 * date: 2019/11/13 19:45
 */

@RestController
public class Hello {

    @GetMapping("hello")
    public String hello(){
        return "hello swagger";
    }
}
