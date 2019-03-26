package com.yibai.plan.warehousing.web.controller;

import com.yibai.plan.warehousing.dto.response.OverseaSummaryDTO;
import com.yibai.plan.warehousing.web.remote.OverseaSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: codeplan
 * @author: zxf
 * @create: 2019-03-12 22:09
 **/
@RestController
@RequestMapping("/overseaSummary")
public class OverseaSummaryController {
    @Autowired
    OverseaSumService overseaSumService;
    @PostMapping("/insertOverseasum")
    public void insertOverseasum(OverseaSummaryDTO dto){
        dto.setSku("13AA");
        dto.setSkuName("测试");
        dto.setTotalRequired(100);
        overseaSumService.addOverseaSummary(dto);
        System.out.print("aaa");
    }
    @GetMapping("/queryOverseaSummary")
    public List<OverseaSummaryDTO> queryOverseaSummary(OverseaSummaryDTO dto){
        return overseaSumService.queryOverseaSummaryList(dto);
    }
}
