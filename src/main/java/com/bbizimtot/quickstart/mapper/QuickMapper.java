package com.bbizimtot.quickstart.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuickMapper {

    HashMap<String, String> findById(HashMap<String, String> paramMap);

    void registerItem(HashMap<String, String> paramMap);
} 
