package com.ls.pay.po;

import com.ls.pay.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jobob
 * @since 2020-04-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="TbUser对象", description="用户表")
public class TbUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String username;

    @ApiModelProperty(value = "状态:1有效，0无效")
    private Integer status;

    @ApiModelProperty(value = "类型:普通用户，0超级管理员")
    private Integer type;

    @ApiModelProperty(value = "MD5加密")
    private String password;
    private String phone;
    private String email;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime modifyTime;


}
