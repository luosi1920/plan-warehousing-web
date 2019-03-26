package com.yibai.plan.warehousing.web.feign;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dto.request.CriteriaDTO;
import com.yibai.plan.warehousing.dto.request.UpdateReqDTO;
import com.yibai.plan.warehousing.dto.response.YibaiOverseaPrListDto;
import com.yibai.plan.warehousing.web.remote.YiBaiOverSeaService;
import org.springframework.stereotype.Component;

/**
 * @description: plan-warehousing
 * @author: lhy
 * @create: 2019-03-10 11:55
 **/
@Component
public class YibaiHystrixFallback implements YiBaiOverSeaService {

    @Override
    public PageResponseDTO<YibaiOverseaPrListDto> queryByCriteria(CriteriaDTO criteriaDto) {
        return null;
    }

    @Override
    public String updateByGid(UpdateReqDTO dto){
        return "服务器错误,请下次再试";
    }

    @Override
    public YibaiOverseaPrListDto queryByGid(String gid) {
        return null;
    }
}
