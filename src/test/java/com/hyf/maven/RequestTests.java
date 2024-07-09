package com.hyf.maven;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author baB_hyf
 * @date 2020/10/11
 */
public class RequestTests {

    @Test
    public void testGet() throws IOException {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 1323; i++) {
            String fileName = i + ".jpg";
            Response response = Request.Get("http://www.lianaigongxin.com/wp-content/uploads/tu/" + fileName).execute();
            Content content = response.returnContent();
            try (BufferedInputStream bis = new BufferedInputStream(content.asStream());
                 FileOutputStream fos = new FileOutputStream("E:\\test\\" + fileName)) {
                int len = 0;
                byte[] bytes = new byte[1024];
                while ((len = bis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
            }
        }
        System.out.println((System.currentTimeMillis() - start) / 1000);
    }
}
