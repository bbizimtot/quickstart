package com.bbizimtot.quickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbizimtot.quickstart.dto.ItemDto;
import com.bbizimtot.quickstart.dto.ResponseDto;
import com.bbizimtot.quickstart.service.QuickService;

import lombok.extern.slf4j.Slf4j;




@RestController
@Slf4j
public class QuickController {
    
    @Autowired
    private QuickService quickService;

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
    public String getMember(@RequestParam(value = "empNo", required = true) String empNo, @RequestParam("year") int year) {
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
    public ResponseDto registerItem(@RequestBody ItemDto item) {
        log.info("item: {}", item);

        boolean b = quickService.registerItem(item);
        if(b) {
            ResponseDto responseDto = new ResponseDto();
            responseDto.setMessage("item ok");
            return responseDto;
        }

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage("item fail");
        return responseDto;
    }
    
    @GetMapping("/item")
    public ItemDto getItem(@RequestParam(value = "id", defaultValue = "1") String id) {
        ItemDto res = quickService.getItemById(id);
        return res;
    }
}
