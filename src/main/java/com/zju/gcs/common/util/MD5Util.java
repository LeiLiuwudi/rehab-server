package com.zju.gcs.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author sy
 * @create 2019-11-09-13:54
 */
public class MD5Util {
    public static String md5Encode(String text) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] btInput = text.getBytes();
            md.update(btInput);
            byte[] btResult = md.digest();
            for (byte b : btResult) {
                int bt = b & 0xff;
                if (bt < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toHexString(bt));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString().toUpperCase();
    }
}
