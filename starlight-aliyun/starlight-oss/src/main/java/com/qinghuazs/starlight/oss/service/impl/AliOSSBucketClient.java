package com.qinghuazs.starlight.oss.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.Bucket;
import com.qinghuazs.starlight.oss.service.OSSBucketClient;
import org.springframework.stereotype.Service;

import static com.qinghuazs.starlight.oss.constants.AccountConstant.ACCESS_KEY;
import static com.qinghuazs.starlight.oss.constants.AccountConstant.ACCESS_SECRET;

/**
 * Ali OSS Bucket 客户端处理类
 */
@Service("aliOSSBucketClient")
public class AliOSSBucketClient implements OSSBucketClient {

    public Bucket createBucket(String endpoint, String bucketName) {
        //创建OSSClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, ACCESS_KEY, ACCESS_SECRET);

        //创建存储空间
        Bucket bucket = ossClient.createBucket(bucketName);

        //关闭OSSClient
        ossClient.shutdown();

        return bucket;
    }
}
