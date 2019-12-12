package com.zcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 管理中心
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ZcdManageRestApplication
{
    public static void main( String[] args )
    {

        SpringApplication.run(ZcdManageRestApplication.class,args);
    }
}
