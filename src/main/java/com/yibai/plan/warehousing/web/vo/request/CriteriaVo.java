package com.yibai.plan.warehousing.web.vo.request;

import com.yibai.plan.warehousing.web.vo.PageRequestVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @description: plan-warehousing
 * @author: lhy
 * @create: 2019-03-11 13:44
 **/
@Getter
@Setter
public class CriteriaVo extends PageRequestVO {

    @ApiModelProperty(value = "创建开始时间", required = false)
    private String startDate;
    @ApiModelProperty(value = "创建结束时间", required = false)
    private String endDate;
    @ApiModelProperty(value = "修改开始时间", required = false)
    private String updatedStart;
    @ApiModelProperty(value = "修改结束时间", required = false)
    private String updatedEnd;
    @ApiModelProperty(value = "审核开始时间", required = false)
    private String approvedStart;
    @ApiModelProperty(value = "审核结束时间", required = false)
    private String approvedEnd;
    @ApiModelProperty(value = "需求单号", required = false)
    private String prSn;
    @ApiModelProperty(value = "sku,精确", required = false)
    private String sku;
    @ApiModelProperty(value = "sku状态", required = false)
    private Byte skuState;
    @ApiModelProperty(value = "是否过期", required = false)
    private Byte expired;
    @ApiModelProperty(value = "审核状态", required = false)
    private Byte approveState;
    @ApiModelProperty(value = "海外仓站点", required = false)
    private String stationCode;
    @ApiModelProperty(value = "是否触发需求", required = false)
    private Byte isTriggerPr;
    @ApiModelProperty(value = "是否计划审核", required = false)
    private Byte isPlanApprove;
    @ApiModelProperty(value = "bd", required = false)
    private Integer bd;
}
