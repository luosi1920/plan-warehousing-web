package com.yibai.plan.warehousing.web.feign;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dto.request.TrackerDTO;
import com.yibai.plan.warehousing.dto.request.TrackerQueryDTO;
import com.yibai.plan.warehousing.dto.response.TrackerRespDTO;
import com.yibai.plan.warehousing.web.remote.TrackerService;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 15:58
 **/

//远程调用发生异常时进入此类
@Component
public class TrackerHystrixFallback implements TrackerService {
    @Override
    public List<TrackerRespDTO> trackerList(TrackerQueryDTO trackerQueryDTO) {
        System.out.println("进入熔断器");
        return null;
    }

    @Override
    public Integer trackerTotal(TrackerQueryDTO trackerQueryDTO) {
        return null;
    }

    @Override
    public TrackerRespDTO selectOne(TrackerDTO trackerDTO) {
        System.out.println("进入熔断器");
        return null;
    }
}
