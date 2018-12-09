package com.ldf.pagehelper.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author ldf
 * @date 2018/12/9 12:27
 **/
@Repository
public interface ITestMapper {

    List<Map<String, Object>> selectList();

}
