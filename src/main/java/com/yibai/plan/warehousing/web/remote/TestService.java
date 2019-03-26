package com.yibai.plan.warehousing.web.remote;

import com.yibai.plan.warehousing.service.TestRemoteService;
import com.yibai.plan.warehousing.web.feign.TestHystrixFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="plan-warehousing")
public interface TestService extends TestRemoteService {
}
