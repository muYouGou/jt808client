package com.yangjie.jt808.client;

/**
 * @author guope
 * @description:
 * @date 2022-01-20 22:35
 */
public class Sgs {

    private static String cityCode = "粤B";
    private static volatile int beginPlateNumber = 11111;
    public static void main(String[] args) {

        TCPClient tcpClient = new TCPClient(0x013500000000L, cityCode + String.valueOf(beginPlateNumber));
        tcpClient.df();
    }
}
