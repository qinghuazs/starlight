package com.qinghuazs.starlight.oss;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OSSBucketClientTest {

    @Before
    public void init() {
        log.debug("start test -------->");
    }

    @After
    public void after() {
        log.debug("end test ---------->");
    }
}
