package com.zcd.system.feign;

import com.zcd.system.api.UserService;
import com.zcd.system.dto.UserDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhongzuoming <zhongzuoming, 1299076979@qq.com>
 * @version v1.0
 * @Description
 * @encoding UTF-8
 * @date 2019/12/12
 * @time 12:09
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */

@FeignClient(name = "zcd-system-service",contextId = "userService",path = "userService")
@RibbonClient()
public interface UserServiceFeign  {

    @PostMapping("saveUser")
    void saveUser(@RequestBody UserDto userDto);


    @GetMapping("selectUser")
    void selectUser();
}
