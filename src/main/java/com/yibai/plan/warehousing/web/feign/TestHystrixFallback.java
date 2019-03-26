package com.yibai.plan.warehousing.web.feign;

import com.yibai.plan.warehousing.dto.response.OverseaSummaryDTO;
import com.yibai.plan.warehousing.dto.response.TestDataRespDTO;
import com.yibai.plan.warehousing.web.remote.OverseaSumService;
import com.yibai.plan.warehousing.web.remote.TestService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestHystrixFallback implements TestService , OverseaSumService {

    @Override
    public String hello(String name) {
        return "服务器开小差";
    }

    @Override
    public List<TestDataRespDTO> queryTestDataAll() {
        return null;
    }


    @Override
    public List<OverseaSummaryDTO> queryOverseaSummaryList(OverseaSummaryDTO dto) {
        return null;
    }

    @Override
    public void addOverseaSummary(OverseaSummaryDTO dto) {

    }
}
