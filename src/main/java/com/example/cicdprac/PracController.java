package com.example.cicdprac;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PracController {

    @Value("${hi.msg}")
    public String msg;

    @GetMapping("/hello")
    public String hi(){
        return "helloWorld!";
    }

    @GetMapping("/hi")
    public String ssg() {
        return msg;
    }
}
