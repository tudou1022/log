package com.boge.logkafka.demo;

import org.apache.log4j.Logger;
/**
 * @ClassName: Log4jToKafka
 * @Description: TODO
 * @Author: zhangwb
 * @Date: 2019/5/28 14:34
 **/
public class Log4jToKafka {
    private static Logger logger = Logger.getLogger(Log4jToKafka.class);

    public static void main(String args[]) {
        System.out.println("hello word!");
        int start = 1;
        while (true) {
            start++;

            try {
                Thread.sleep(50l);
                logger.info(start + "hello Log4jToKafka test !");
                logger.error(start + "hello Log4jToKafka test !");
                int i = 1/0;
            } catch (Exception e) {
                logger.error("sdas"+e);
                logger.error("sdas"+e.getMessage());
            }
        }

    }
}
