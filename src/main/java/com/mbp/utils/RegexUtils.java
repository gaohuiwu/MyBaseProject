package com.mbp.utils;

import java.util.regex.Pattern;

/**
 * FileName:RegexUtils
 * Author:  ghw06
 * Date:    2018/4/4 15:10
 * Description: 正则工具类
 */
public class RegexUtils {

    private static final Pattern MOBILE_PATTERN = Pattern.compile("^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$");

    private static final Pattern MAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$");

    /**
     * 验证手机号码
     * ^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$
     * 2018年1月的手机正则表达式
     *
     * @param mobile 验证成功返回true,验证失败返回false
     * @return
     */
    public static boolean checkMobile(String mobile) {
        return MOBILE_PATTERN.matcher(mobile).matches();
    }

    /**
     * 验证邮箱有效性
     * ^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.[a-zA-Z0-9]{2,6}$
     * 2017年11月的邮箱正则表达式
     *
     * @param mail 验证成功返回true,验证失败返回false
     * @return
     */
    public static final boolean checkMail(String mail) {
        return MAIL_PATTERN.matcher(mail).matches();
    }


}
