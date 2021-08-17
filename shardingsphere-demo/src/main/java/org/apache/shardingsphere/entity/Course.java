package org.apache.shardingsphere.entity;

import lombok.Data;

/**
 * @author Jie Zhao
 * @date 2021/8/17 21:58
 */
@Data
public class Course {

    private Long cid;
    private String name;
    private Long userId;
    private String cstatus;
}
