package com.ls.pay.po;


import com.ls.pay.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author jobob
 * @since 2020-05-02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="TbItem对象", description="商品表")
public class TbItem extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品名称")
    private String itemName;

    @ApiModelProperty(value = "商品卖点")
    private String sellPoint;

    @ApiModelProperty(value = "商品价格，单位为：分")
    private Long price;

    @ApiModelProperty(value = "库存数量")
    private Integer num;

    @ApiModelProperty(value = "商品条形码")
    private String barcode;

    @ApiModelProperty(value = "商品图片")
    private String image;

    @ApiModelProperty(value = "商品状态，1-正常，2-下架，3-删除")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date modifyTime;


}
