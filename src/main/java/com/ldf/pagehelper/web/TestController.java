package com.ldf.pagehelper.web;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.ldf.pagehelper.service.ITestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ldf
 * @date 2018/12/9 12:07
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ITestService testService;

    @ApiOperation(value = "分页测试")
    @GetMapping("page")
    public Object pageTest(int pageNum, int pageSize){
        return new PageInfo(testService.searchlist(pageNum, pageSize));
    }

}
