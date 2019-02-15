package com.kun.dubborestdemo.foo.dubbo;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception{
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:dubbo/provider.xml");
        context.start();
        // 阻塞
        System.in.read();
    }
}

