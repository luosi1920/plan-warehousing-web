package com.yibai.plan.warehousing.web.controller;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dto.request.CriteriaDTO;
import com.yibai.plan.warehousing.dto.request.UpdateReqDTO;
import com.yibai.plan.warehousing.dto.response.YibaiOverseaPrListDto;
import com.yibai.plan.warehousing.web.remote.YiBaiOverSeaService;
import com.yibai.plan.warehousing.web.util.ConvertUtils;
import com.yibai.plan.warehousing.web.vo.Result;
import com.yibai.plan.warehousing.web.vo.request.CriteriaVo;
import com.yibai.plan.warehousing.web.vo.request.UpdateReqVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: plan-warehousing
 * @author: lhy
 * @create: 2019-03-10 11:07
 **/
@RestController
@RequestMapping("/overSeaList")
public class YiBaiOverSeaListController {

    @Autowired
    private YiBaiOverSeaService yiBaiOverSeaService;


    /**
     * @param criteriaVo 条件封装
     * @return
     */
    @PostMapping("/queryByCriteria")
    public Result queryByCriteria(@RequestBody CriteriaVo criteriaVo) {
        try {
            CriteriaDTO criteriaDto = ConvertUtils.convert(criteriaVo, CriteriaDTO.class);
            PageResponseDTO<YibaiOverseaPrListDto> pageBean = yiBaiOverSeaService.queryByCriteria(criteriaDto);
            return Result.with(pageBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/queryByGid")
    public Result queryByGid(@RequestParam("gid") String gid) {
        try {
            YibaiOverseaPrListDto yibaiOverseaPrListDto = yiBaiOverSeaService.queryByGid(gid);
            return Result.with(yibaiOverseaPrListDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @PostMapping("/updateByGid")
    public Result updateByGid(@RequestBody UpdateReqVo vo) {
        UpdateReqDTO dto = ConvertUtils.convert(vo, UpdateReqDTO.class);
        String flag = yiBaiOverSeaService.updateByGid(dto);
        return Result.with(flag);
    }
}
