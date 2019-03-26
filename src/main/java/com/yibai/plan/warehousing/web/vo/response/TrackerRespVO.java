package com.yibai.plan.warehousing.web.vo.response;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: plan-warehousing
 * @author: lx
 * @create: 2019-03-11 14:16
 **/
@ApiModel
@Getter
@Setter
public class TrackerRespVO implements Serializable {
    private static final long serialVersionUID = 3254297929154173056L;
    private String gid;//
    @ApiModelProperty(value = "需求单号")
    private String prSn;//需求单号
    @ApiModelProperty(value = "sku")
    private String sku;//sku
    @ApiModelProperty(value = "站点")
    private String stationCode;//站点
    @ApiModelProperty(value = "sku中文名字")
    private String skuName;//sku中文名字
    @ApiModelProperty(value = "订购数量")
    private Integer purchaseOrderQty;//订购数量(pcs)
    @ApiModelProperty(value = "BD"  )
    private Short bd;//BD(pcs)
    @ApiModelProperty(value = "需求数量")
    private Integer requireQty;//需求数量(pcs)
    @ApiModelProperty(value = "预计缺货时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expectExhaustDate;//预计缺货时间
    @ApiModelProperty(value = "审核状态")
    private Byte approveState;//审核状态
    @ApiModelProperty(value = "备货单号")
    private String purSn;//备货单号
    @ApiModelProperty(value = "是否需要实际备货 Y 需要 N 不需要")
    private String isActualPurchase;//是否需要实际备货 Y 需要 N 不需要
    @ApiModelProperty(value = "备货数量")
    private Integer purchaseQty;//备货数量(pcs)
    @ApiModelProperty(value = "多余库存")
    private Integer surplusQty;//多余库存(pcs)
    @ApiModelProperty(value = "备货单状态")
    private Byte purState;//备货单状态
    @ApiModelProperty(value = "审核备注")
    private String remark;//审核备注
    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;//更新时间
    @ApiModelProperty(value = "生成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;//生成时间

    public TrackerRespVO() {
    }
}
