package com.jin.service;

import com.jin.protobuf.ProtoBufService;
import com.jin.thrift.ThriftService;

/**
 * @author wu.jinqing
 * @date 2017年07月06日
 */
public class Client {
    public static void main(String[] args) {
        ThriftService thriftService = new ThriftService();

        thriftService.sayHello();

        ProtoBufService protoBufService = new ProtoBufService();

        protoBufService.sayHello();
    }
}
