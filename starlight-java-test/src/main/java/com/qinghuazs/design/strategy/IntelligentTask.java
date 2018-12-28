package com.qinghuazs.design.strategy;

import com.qinghuazs.design.strategy.bo.TaskBo;

public abstract class IntelligentTask {

    protected abstract void validate(TaskBo taskBo) throws Exception;

    protected void validateTaskBo(TaskBo taskBo) throws Exception{
        if (taskBo == null) {
            throw new Exception("error");
        }
    }
}
