package com.pf.tmpl.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName BCryptPasswordEncoderUtils
 * @Description TODO
 * @Author pengfei
 * @Date 2023/3/15
 **/
public class BCryptPasswordEncoderUtils {

    public static String encode(String text) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
       return encoder.encode(text);
    }

    public static void main(String[] args) {
        System.out.println(encode("admin"));
    }
}
