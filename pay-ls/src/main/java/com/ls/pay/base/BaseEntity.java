package com.ls.pay.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;


@Data
public class BaseEntity implements Serializable {
    @ApiModelProperty("id")
    @TableId(type = IdType.AUTO)
    private Long id;

}
