package com.kun.dubborestdemo.dubbo.service.provider.impl;

import com.kun.dubborestdemo.dubbo.service.provider.ServiceFacade;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * 实现类
 * 
 * @author xuyaokun
 * @date 2019/2/15 16:00
 */
@Path("demo")
public class ServiceImpl implements ServiceFacade {

    @Override
    @Path("hello")
    @GET
    public String hello() {
        System.out.println("进入ServiceImpl.hello");
        return "Hello World! ";
    }

}
