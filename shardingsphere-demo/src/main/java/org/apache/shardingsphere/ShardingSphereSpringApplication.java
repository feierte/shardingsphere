package org.apache.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Jie Zhao
 * @date 2021/8/17 21:44
 */
@SpringBootApplication
@MapperScan(basePackages = {"org.apache.shardingsphere.mapper"})
public class ShardingSphereSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereSpringApplication.class, args);
    }
}
