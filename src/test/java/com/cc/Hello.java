package com.cc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Hello {
    private static String name = "山风小子";
    public static void sayHello() {
        System.out.println("Hello " + name);
    }




    public static void main(String[] args) {
        sayHello();
    }

    public static List<String> getFileContentToList(String path) throws IOException {
        List<String> list = new ArrayList<String>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null; // 用于包装InputStreamReader,提高处理性能。因为BufferedReader有缓冲的，而InputStreamReader没有。
        try {
            String str = "";
            fis = new FileInputStream(path);// FileInputStream
            // 从文件系统中的某个文件中获取字节
            isr = new InputStreamReader(fis);// InputStreamReader 是字节流通向字符流的桥梁,
            br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象
            while ((str = br.readLine()) != null) {
                list.add(str);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
                br.close();
                isr.close();
                fis.close();
        }
        return list;
    }


}
