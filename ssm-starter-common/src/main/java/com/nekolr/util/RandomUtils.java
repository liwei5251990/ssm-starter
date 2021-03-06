package com.nekolr.util;

import java.util.Random;

/**
 * 随机值工具类
 *
 * @author nekolr
 */
public class RandomUtils {

    private RandomUtils() {
    }

    /**
     * 获取随机字符串
     *
     * @param length 字符串的长度
     * @return
     */
    public static String randomString(int length) {
        final String origin = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        final int len = origin.length();
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(origin.charAt(random.nextInt(len)));
        }
        return builder.toString();
    }
}
