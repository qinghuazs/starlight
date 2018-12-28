package com.qinghuazs.design.strategy;

import com.qinghuazs.design.strategy.bo.TaskBo;
import org.apache.commons.lang3.StringUtils;

public class PictureTask extends IntelligentTask{

    @Override
    public void validate(TaskBo taskBo) throws Exception{
        validateTaskBo(taskBo);
        if (StringUtils.isEmpty(taskBo.getChannels())) {
            throw new Exception("channel info error");
        }
    }
}
