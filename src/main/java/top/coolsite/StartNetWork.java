package top.coolsite;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @description: ksfj
 * @author: zhanjinbing
 * @data: 2019-10-24 11:23
 */
public class StartNetWork {

    public static void main(String[] args) throws IOException {
        String urlPath = "http://dict.youdao.com/dictvoice?audio=two&type=1";
        URL url = new URL(urlPath);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

//        请求成功
        System.out.println(connection.getResponseCode());
        if (connection.getResponseCode() == 200) {
            File outFile = new File("C:\\Users\\DELL\\Desktop\\see.mp3");


            try (InputStream inputStream = connection.getInputStream();
                 OutputStream out = new FileOutputStream(outFile)) {

                byte[] bs = new byte[1000024];
                inputStream.read(bs);
                out.write(bs);
            }


        }
        System.out.println("skfjls");
//        断开连接，释放资源
        connection.disconnect();
    }
}
