package com.danilo.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	@Value("${test.url:teste}")
    private String urlTest;

    @GetMapping("/")
    public String getUrlTest(){
        return urlTest;
    }
}