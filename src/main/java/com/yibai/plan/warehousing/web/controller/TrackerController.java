package com.yibai.plan.warehousing.web.controller;

import com.yibai.crown.provider.dto.response.PageResponseDTO;
import com.yibai.plan.warehousing.dto.request.TrackerDTO;
import com.yibai.plan.warehousing.dto.request.TrackerQueryDTO;
import com.yibai.plan.warehousing.dto.response.TrackerRespDTO;
import com.yibai.plan.warehousing.web.remote.TrackerService;
import com.yibai.plan.warehousing.web.util.ConvertUtils;
import com.yibai.plan.warehousing.web.vo.Result;
import com.yibai.plan.warehousing.web.vo.request.TrackerQueryVO;
import com.yibai.plan.warehousing.web.vo.request.TrackerVO;
import com.yibai.plan.warehousing.web.vo.response.TrackerRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 15:06
 **/
@RestController
@RequestMapping("/tracker")
public class TrackerController {

    @Autowired
    TrackerService trackerService;

    //获取需求列表
    @RequestMapping(value = "/list",method=RequestMethod.POST)
    public  Result<PageResponseDTO>  trackerList(@RequestBody TrackerQueryVO tracker){
        //设置开始记录下表
        tracker.setStart((tracker.getPageNumber()-1)*tracker.getPageSize());
        //将入参转换成DTO
        TrackerQueryDTO trackerQueryDTO = ConvertUtils.convert(tracker, TrackerQueryDTO.class);
        //调用获取列表
        List<TrackerRespDTO> trackerRespDTOS=trackerService.trackerList(trackerQueryDTO);
       // List<TrackerRespVO> trackerRespVOS=ConvertUtils.convert(trackerRespDTOS, TrackerRespVO.class);
        //获取总记录数
        Integer total=trackerService.trackerTotal(trackerQueryDTO);
        //封装返回对象
        PageResponseDTO<TrackerRespDTO> pageResponseDTO=new PageResponseDTO();
        pageResponseDTO.measureTotalPage(total,trackerQueryDTO.getPageSize());
        pageResponseDTO.setItems(trackerRespDTOS);
        return  Result.with(pageResponseDTO);
    }

    //获取指定需求单号的详细信息
    @RequestMapping(value = "/selectOne",method=RequestMethod.POST)
    public Result<TrackerRespVO> selectOne(@RequestBody TrackerVO tracker){
        //将入参转换成DTO
        TrackerDTO trackerDTO = ConvertUtils.convert(tracker, TrackerDTO.class);
        //调用获取单条需求跟踪订单
        TrackerRespDTO trackerRespDTO =trackerService.selectOne(trackerDTO);
        //将DTO转换成VO
        TrackerRespVO trackerRespVO =ConvertUtils.convert(trackerRespDTO, TrackerRespVO.class);
        return  Result.with(trackerRespVO);
    }


}
