package com.mbp.interceptor;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * FileName:Interceptor
 * Author:  ghw06
 * Date:    2017/12/14 10:54
 * Description: 拦截器
 */
public class Interceptor extends HandlerInterceptorAdapter implements ApplicationListener<ContextRefreshedEvent> {

    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

    }
}


