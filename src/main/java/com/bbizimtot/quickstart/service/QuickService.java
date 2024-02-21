package com.bbizimtot.quickstart.service;

import org.springframework.stereotype.Service;

import com.bbizimtot.quickstart.dto.ItemDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QuickService {
    
    public Boolean registerItem(ItemDto itemDto) {

        log.info("servie ...");

        return true;
    }
}
