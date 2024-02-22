package com.bbizimtot.quickstart.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbizimtot.quickstart.dto.ItemDto;
import com.bbizimtot.quickstart.entity.ItemEntity;
import com.bbizimtot.quickstart.mapper.QuickMapper;
import com.bbizimtot.quickstart.repository.ItemRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QuickService {
    
    @Autowired
    private QuickMapper quickMapper;

    @Autowired
    private ItemRepository itemRepository;

    public Boolean registerItem(ItemDto itemDto) {

        //-------mybatis-------
        // HashMap<String, String> paramMap = new HashMap<>();
        // paramMap.put("id", itemDto.getId());
        // paramMap.put("name", itemDto.getName());

        // quickMapper.registerItem(paramMap);

        // log.info("Insert ...");

        // return true;
        //-------mybatis-------

        //-------jpa-------

        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setId(itemDto.getId());
        itemEntity.setName(itemDto.getName());

        itemRepository.save(itemEntity);

        return true;
        //-------jpa-------
    }

    public ItemDto getItemById(String id) {

        //-------mybatis-------
        // HashMap<String, String> paramMap = new HashMap<>();
        // paramMap.put("id", id);

        // HashMap<String, String> res = quickMapper.findById(paramMap);

        // ItemDto itemDto = new ItemDto();
        // itemDto.setId(res.get("ID"));
        // itemDto.setName(res.get("NAME"));

        // return itemDto;
        //-------mybatis-------

        //-------jpa-------
        ItemEntity itemEntity = itemRepository.findById(id).get();
        ItemDto itemDto = new ItemDto();

        itemDto.setId(itemEntity.getId());
        itemDto.setName(itemEntity.getName());

        return itemDto;
        //-------jpa-------
    }
}
