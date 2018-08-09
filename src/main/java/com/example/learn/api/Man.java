package com.example.learn.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 该注解使用在类上，该注解会提供getter、setter、equals、canEqual、hashCode、toString方法。
 */
@Data
@ApiModel(value = "man对象", description = "用户对象man")
public class Man {
    @ApiModelProperty(value = "用户名", name = "name", dataType = "string", example = "王二", required = true)
    private String name;
    @ApiModelProperty("年龄")
    private String age;
    @ApiModelProperty("性别")
    private Integer gender;
}
