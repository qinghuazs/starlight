package com.qinghuazs.starlight.oss.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.qinghuazs.starlight.oss.enums.OSSRegionEndpointEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.qinghuazs.starlight.oss.constants.AccountConstant.ACCESS_KEY;
import static com.qinghuazs.starlight.oss.constants.AccountConstant.ACCESS_SECRET;

/**
 * OSS 基本参数配置，并将OSS交给Spring来管理
 * TODO DELETE 创建OSS对象不关闭连接的话，会不会导致连接超出限制
 */
@Configuration
public class OSSConfig {

    @Bean("ossClient")
    public OSS ossClientConfig() {
        return new OSSClientBuilder().build(OSSRegionEndpointEnum.OSS_HAGNZHOU.getOuterEndpoint(), ACCESS_KEY, ACCESS_SECRET);
    }
}
