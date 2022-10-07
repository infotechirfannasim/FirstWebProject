package com.learning.fp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FirstServiceAPI {

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String getFirstService() {
        return "Hello World";
    }
}
