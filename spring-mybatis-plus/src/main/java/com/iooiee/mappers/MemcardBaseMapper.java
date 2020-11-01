package com.iooiee.mappers;

import com.iooiee.entity.MemcardBase;
import org.springframework.stereotype.Repository;

@Repository
public interface MemcardBaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemcardBase record);

    int insertSelective(MemcardBase record);

    MemcardBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemcardBase record);

    int updateByPrimaryKey(MemcardBase record);
}