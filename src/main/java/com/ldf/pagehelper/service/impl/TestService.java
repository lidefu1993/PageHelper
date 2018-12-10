package com.ldf.pagehelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.ldf.pagehelper.mapper.ITestMapper;
import com.ldf.pagehelper.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ldf
 * @date 2018/12/9 12:30
 **/
@Service
public class TestService implements ITestService {

    @Autowired
    private ITestMapper testMapper;

    @Override
    public List<Map<String, Object>> searchlist(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return testMapper.selectList();
    }
}
