package com.qinghuazs.design.strategy.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskBo {

    private String taskId;
    private Integer taskMode;
    private Integer taskEnabled;
    private Integer interval;
    private String template;
    private String channels;
}
