package com.qinghuazs.starlight.oss;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.Bucket;
import com.qinghuazs.starlight.oss.enums.OSSRegionEndpointEnum;
import com.qinghuazs.starlight.oss.service.OSSBucketClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;

import static com.qinghuazs.starlight.oss.constants.AccountConstant.ACCESS_KEY;
import static com.qinghuazs.starlight.oss.constants.AccountConstant.ACCESS_SECRET;

public class AliOSSBucketClientTest extends OSSBucketClientTest {

    @Autowired
    private OSSBucketClient aliOSSBucketClient;

    private String endpoint = OSSRegionEndpointEnum.OSS_HAGNZHOU.getOuterEndpoint();

    String bucketName = "qinghuazs-test";

    @Test
    public void createBucket() {
        aliOSSBucketClient.createBucket(OSSRegionEndpointEnum.OSS_HAGNZHOU.getOuterEndpoint(), "qinghuazs-test");
    }

    @Test
    public void getBucket() {
        //创建OSSClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, ACCESS_KEY, ACCESS_SECRET);

        ossClient.putObject(bucketName,"test", new ByteArrayInputStream("hello oss".getBytes()));

        //关闭OSSClient
        ossClient.shutdown();
    }


}
