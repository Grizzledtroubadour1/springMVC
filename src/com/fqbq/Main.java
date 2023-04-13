package com.fqbq;

import com.fqbq.mvc.FqbqMvc;


public class Main {
    static {
        //该方法可以获取指定资源的URL，而这里传入的参数是一个空字符串，表示获取当前类所在的目录。
        String path = Main.class.getResource("").getPath();
        String packageName = Main.class.getPackage().getName();
        FqbqMvc.scanner(path,packageName);
    }

    public static void main(String[] args) {
        FqbqMvc.exec("","");
        FqbqMvc.exec("test","index1");
        FqbqMvc.exec("test","");
        System.out.println("Hello World!");
    }
}
