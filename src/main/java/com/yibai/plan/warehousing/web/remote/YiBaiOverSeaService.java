package com.yibai.plan.warehousing.web.remote;

import com.yibai.plan.warehousing.service.YiBaiOverSeaRemoteService;
import com.yibai.plan.warehousing.web.feign.YibaiHystrixFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="plan-warehousing",fallback = YibaiHystrixFallback.class)
public interface YiBaiOverSeaService extends YiBaiOverSeaRemoteService {
}
