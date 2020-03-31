package com.qinghuazs.starlight.oss.service;

import com.aliyun.oss.model.Bucket;

/**
 * OSS 存储空间 处理类
 */
public interface OSSBucketClient {

    /**
     * 指定访问域名下创建存储空间
     * @param endpoint 访问域名
     * @param bucketName 存储空间名称
     * @return 创建好的Bucket信息
     */
    Bucket createBucket(String endpoint, String bucketName);
}
