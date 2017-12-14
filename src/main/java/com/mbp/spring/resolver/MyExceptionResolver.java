package com.mbp.spring.resolver;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * FileName:MyExceptionResolver
 * Author:  ghw06
 * Date:    2017/12/14 14:32
 * Description: 异常处理
 */
public class MyExceptionResolver implements HandlerExceptionResolver {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        return null;
        //内容要自己写
    }
}
