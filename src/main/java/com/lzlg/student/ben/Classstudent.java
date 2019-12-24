package com.lzlg.student.ben;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class Classstudent implements Serializable {
    @ApiModelProperty(value = "学号")
    private int id;
    @ApiModelProperty(value = "姓名")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
