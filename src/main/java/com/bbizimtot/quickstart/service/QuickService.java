package com.bbizimtot.quickstart.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbizimtot.quickstart.dto.ItemDto;
import com.bbizimtot.quickstart.mapper.QuickMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QuickService {
    
    @Autowired
    private QuickMapper quickMapper;

    public Boolean registerItem(ItemDto itemDto) {

        HashMap<String, String> paramMap = new HashMap<>();
        paramMap.put("id", itemDto.getId());
        paramMap.put("name", itemDto.getName());

        quickMapper.registerItem(paramMap);

        log.info("Insert ...");

        return true;
    }

    public ItemDto getItemById(String id) {

        HashMap<String, String> paramMap = new HashMap<>();
        paramMap.put("id", id);

        HashMap<String, String> res = quickMapper.findById(paramMap);

        ItemDto itemDto = new ItemDto();
        itemDto.setId(res.get("ID"));
        itemDto.setName(res.get("NAME"));

        return itemDto;
    }
}
