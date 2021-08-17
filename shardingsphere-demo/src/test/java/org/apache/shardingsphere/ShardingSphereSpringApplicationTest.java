package org.apache.shardingsphere;

import org.apache.shardingsphere.mapper.CourseMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Jie Zhao
 * @date 2021/8/17 22:05
 */
@SpringBootTest
public class ShardingSphereSpringApplicationTest {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void test() {
        
    }
}
