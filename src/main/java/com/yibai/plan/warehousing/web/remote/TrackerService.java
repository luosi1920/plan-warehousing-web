package com.yibai.plan.warehousing.web.remote;

import com.yibai.plan.warehousing.service.TrackerRemoteService;
import com.yibai.plan.warehousing.web.feign.TrackerHystrixFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 15:51
 **/
//远程调用并指定熔断对象
@FeignClient(value="plan-warehousing",fallback = TrackerHystrixFallback.class)
public interface TrackerService extends TrackerRemoteService {
}
