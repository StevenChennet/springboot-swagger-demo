package com.teld.bdp.springbootswaggerdemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel(value = "学生实体")
public class Student {
    @ApiModelProperty("学生id")
    private String id;
    @ApiModelProperty("学生名称")
    private String name;
    @ApiModelProperty("学生年龄")
    private int age;
}
