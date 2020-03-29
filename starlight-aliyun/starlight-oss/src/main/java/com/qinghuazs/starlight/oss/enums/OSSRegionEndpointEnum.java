package com.qinghuazs.starlight.oss.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * aliyun OSS Region和Endpoint对照表
 * @link {https://help.aliyun.com/document_detail/31837.html?spm=a2c4g.11186623.2.13.59b74c072QEhqY#concept-zt4-cvy-5db}
 */
@Getter
public enum OSSRegionEndpointEnum {

    OSS_HAGNZHOU("oss-cn-hangzhou", "oss-cn-hangzhou.aliyuncs.com", "oss-cn-hangzhou-internal.aliyuncs.com"),
    OSS_BEIJING("oss-cn-beijing", "oss-cn-beijing.aliyuncs.com", "oss-cn-beijing-internal.aliyuncs.com"),
    ;

    /**
     * Region英文表示
     */
    private String region;

    /**
     * 外网Endpoint
     */
    private String outerEndpoint;

    /**
     * ECS访问的内网Endpoint
     */
    private String innerEndpoint;

    OSSRegionEndpointEnum(String region, String outerEndpoint, String innerEndpoint) {
        this.region = region;
        this.outerEndpoint = outerEndpoint;
        this.innerEndpoint = innerEndpoint;
    }
}
