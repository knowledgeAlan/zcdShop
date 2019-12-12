package com.zcd.system;

import com.netflix.discovery.converters.Auto;
import com.zcd.common.dto.ZcdResponseDto;
import com.zcd.system.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhongzuoming <zhongzuoming, 1299076979@qq.com>
 * @version v1.0
 * @Description
 * @encoding UTF-8
 * @date 2019/12/12
 * @time 17:03
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@RestController
@RequestMapping("loadbalance")
public class LoadBalanceController {

    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private UserServiceFeign userServiceFeign;


    @GetMapping("selectUser")
    public ZcdResponseDto selectUser(){
        ZcdResponseDto zcdResponseDto = new ZcdResponseDto();

        userServiceFeign.selectUser();
        return zcdResponseDto;
    }
}
