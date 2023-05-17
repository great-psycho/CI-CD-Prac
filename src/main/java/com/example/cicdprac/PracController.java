package com.example.cicdprac;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PracController {
    @GetMapping("/hello")
    public String hi(){
        return "helloWord!";
    }

    @PostMapping("/memo")
    public String ssg(String memo) {
        return memo;
    }
}
