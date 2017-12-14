package com.mbp.spring.resolver;

import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;

/**
 * FileName:MyMultipartResolver
 * Author:  ghw06
 * Date:    2017/12/14 14:28
 * Description: 文件上传
 */
public class MyMultipartResolver extends CommonsMultipartResolver {

    @Override
    public boolean isMultipart(HttpServletRequest request) {
        if (request.getServletPath().startsWith("/upload/upload")) {
            return false;
        }
        return super.isMultipart(request);
    }
}
