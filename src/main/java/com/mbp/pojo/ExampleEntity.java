package com.mbp.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

/**
 * FileName:ExampleEntity
 * Author:  ghw06
 * Date:    2017/12/17 12:35
 * Description: demo用户
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Component
public class ExampleEntity {

    private String name;
    private int age;
    private long id;
}
