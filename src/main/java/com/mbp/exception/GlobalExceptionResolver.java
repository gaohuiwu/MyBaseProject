package com.mbp.exception;

/**
 * FileName:GlobalExceptionResolver
 * Author:  ghw06
 * Date:    2017/12/14 10:40
 * Description: 自定义异常类 全局异常捕捉
 */
public class GlobalExceptionResolver extends RuntimeException {
    public GlobalExceptionResolver() {
        super();
    }

    public GlobalExceptionResolver(String msg, Throwable cause) {
        super(msg, cause);
        //Do something...
    }
}
