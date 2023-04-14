package com.pf.tmpl.util;

import com.pf.tmpl.constant.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName HttpResponseRender
 * @Description TODO
 * @Author pengfei
 * @Date 2022/9/2
 **/
@Slf4j
public class HttpResponseRender {

    public static void render(HttpServletResponse response, HttpStatus status, String msg){
        try {
            response.setContentType(Constant.APPLICATION_JSON);
            response.setStatus(status.value());
            OutputStream outputStream = response.getOutputStream();
            outputStream.write(msg.getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
        } catch (IOException e) {
            log.error("response render error:", e);
        }
    }
}
