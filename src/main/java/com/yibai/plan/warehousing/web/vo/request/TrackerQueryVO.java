package com.yibai.plan.warehousing.web.vo.request;

import com.yibai.crown.web.vo.PageRequestVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 14:44
 **/
@ApiModel
@Getter
@Setter
public class TrackerQueryVO extends PageRequestVO implements Serializable {
    private static final long serialVersionUID = 3254297929154173057L;
    @ApiModelProperty(value = "预计取货时间开始", required = false)
    private String expectExhaustDateBegin;//预计取货时间开始
    @ApiModelProperty(value = "预计缺货时间结束", required = false)
    private String expectExhaustDateEnd;//预计缺货时间结束
    @ApiModelProperty(value = "生成时间开始", required = false)
    private String ecreatedAtBegin;//生成时间开始
    @ApiModelProperty(value = "生成时间结束", required = false)
    private String createdAtEnd;//生成时间结束
    @ApiModelProperty(value = "需求单号", required = false)
    private String prSn;//需求单号
    @ApiModelProperty(value = "SKU", required = false)
    private String sku;
    @ApiModelProperty(value = "备货单号", required = false)
    private String purSn;//备货单号
    @ApiModelProperty(value = "备货单状态", required = false)
    private Integer purState;//备货单状态
    @ApiModelProperty(value = "站点", required = false)
    private String stationCode;//站点
    private Integer start;//从第几条开始查

    public TrackerQueryVO() {
    }
}
