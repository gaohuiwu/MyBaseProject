package com.mbp.utils;


import jdk.nashorn.internal.scripts.JD;
import jodd.datetime.JDateTime;
import org.slf4j.LoggerFactory;

/**
 * FileName:JDateTimeUtil
 * Author:  ghw06
 * Date:    2018/2/11 9:58
 * Description: JODD中的时间操作类
 */
public class JDateTimeUtil {

    private final static org.slf4j.Logger logger= LoggerFactory.getLogger(JDateTimeUtil.class);

    /**
     * 构造函数的使用
     */
    public void testConstructor(){
        JDateTime jdt=new JDateTime();
        jdt=new JDateTime(2018,02,11);
        jdt=new JDateTime(System.currentTimeMillis());
        jdt=new JDateTime(2018,02,11,10,20,11,124);
        jdt=new JDateTime("2018-02-11 11:25:22.124");
        jdt=new JDateTime("02/11/2018","MM/DD/YYYY");

    }

    public void testSet(){
        JDateTime jdt=new JDateTime();
        /**
         * set方法的使用：设定日期时间
         */
        jdt.set(2018,02,11,10,20,11,124);
        jdt.set(2018,02,11);
        jdt.setDate(2018,02,11);

        jdt.setCurrentTime();
        jdt.setYear(1973);
        jdt.setHour(22);
        jdt.setTime(18,00,12,853);
    }

    public void testGet(){
        JDateTime jdt=new JDateTime();
        /**
         * get方法的使用：读取日期和时间
         */
        jdt.getYear();
        jdt.getDateTimeStamp();
        logger.warn("1"+jdt.getDateTimeStamp());//获取当前时间
        logger.warn("1"+jdt.getJulianDate());
        logger.warn("1"+jdt.getDay()) ;
        logger.warn("1"+jdt.getDayOfMonth()) ;
        logger.warn("1"+jdt.getDayOfWeek()) ;
        logger.warn("1"+jdt.getDayOfYear()) ;
        logger.warn("1"+jdt.getEra()) ;
        logger.warn("1"+jdt.getFirstDayOfWeek()) ;
        logger.warn(jdt.getFormat()) ;
    }

    public void testAdd(){
        JDateTime jdt=new JDateTime();
        jdt.add(1,2,3,4,5,6,7);
        jdt.add(4,2,0);
        jdt.addMonth(-12);
        jdt.subYear(1);
        jdt.addHour(22);
    }

    public void testAdd2() {
        JDateTime jdt = new JDateTime() ;
        logger.warn(jdt.toString("YYYY-MM-DD")) ;
        jdt.addDay(-20) ;
        logger.warn(jdt.toString("YYYY-MM-DD")) ;
        jdt.               addDay(10, true) ;
        logger.warn(jdt.toString("YYYY-MM-DD")) ;
        jdt.addYear(1);
        logger.warn(jdt.toString("YYYY-MM-DD")) ;
    }
    public void testFormat() {
        JDateTime jdt = new JDateTime();        // set current date and time
        /**
         * 转换说明
         YYYY    年
         MM      月
         DD      日
         D       一周中的第几天 从周一算起
         MML     月,长型
         MMS     月,短行
         DL      一周中的第几天 长型 从周一算起
         DS      一周中的第几天 短型 从周一算起
         hh      小时
         mm      分钟
         ss      秒
         mss     毫秒
         DDD     一年中的第几天
         WW      一年中的第几周
         WWW     一年中的第几周并用W标识
         W       一个月中的第几周
         E       年代,公元前还是公元后
         TZL     时间长型
         TZS     时间短型
         *
         */
        logger.warn("convertToDate:"+jdt.convertToDate());
        logger.warn(jdt.toString("YYYY-MM-DD"));

        logger.warn(jdt.toString("YYYY-MM-DD hh:mm:ss"));//转换成字符串
        logger.warn(jdt.toString("WW"));//本年度第几周
        logger.warn(jdt.toString("YYYY")) ;
    }
}
