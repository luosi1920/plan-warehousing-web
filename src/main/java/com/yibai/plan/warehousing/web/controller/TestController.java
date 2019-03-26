package com.yibai.plan.warehousing.web.controller;

import com.yibai.plan.warehousing.dto.response.TestDataRespDTO;
import com.yibai.plan.warehousing.web.remote.TestService;
import com.yibai.plan.warehousing.web.util.ConvertUtils;
import com.yibai.plan.warehousing.web.vo.Empty;
import com.yibai.plan.warehousing.web.vo.Result;
import com.yibai.plan.warehousing.web.vo.response.TestDataRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public void hello (){

        System.out.println(testService.hello("光头强"));
    }

    @RequestMapping("/queryTestDataAll")
    public Result<List<TestDataRespVO>> queryTestDataAll (){
        List<TestDataRespDTO> testDataRespDTOS = testService.queryTestDataAll();
        List<TestDataRespVO> testDataRespVOS = ConvertUtils.convert(testDataRespDTOS, TestDataRespVO.class);
        return Result.with(testDataRespVOS);
    }

    @RequestMapping("/update")
    public Result<Empty> update(){
        return Result.with(Empty.getInstance());
    }
}
