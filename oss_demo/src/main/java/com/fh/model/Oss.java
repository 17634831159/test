package com.fh.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_oss")
public class Oss {
    private int id;
    private String name;
        @TableField(value = "fileName")
    private String fileName;
}
