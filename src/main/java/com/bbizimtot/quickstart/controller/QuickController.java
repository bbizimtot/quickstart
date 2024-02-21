package com.bbizimtot.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@Slf4j
public class QuickController {
    
    @GetMapping("/dummy")
    public String dummy() {
        log.info("dummy");
        return "{}";
    }
    
    @GetMapping("/dummy2")
    public String dummy2() {
        log.info("dummy2");
        return "dummy2";
    }

    @GetMapping("/member")
    public String getMember(@RequestParam("empNo") String empNo, @RequestParam("year") int year) {
        log.info("empNo: {}", empNo);
        log.info("year: {}", year);
        return "member ok";
    }

    @GetMapping("/company/{id}")
    public String getcompany(@PathVariable("id") String id) {
        log.info("id: {}", id);
        return "company ok";
    }
    
    @PostMapping("/item")
    public String registerItem(@RequestBody String item) {
        log.info("item: {}", item);
        return "item ok";
    }
    
}
