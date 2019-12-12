package com.zcd.system;

import com.zcd.common.dto.ZcdResponseDto;
import com.zcd.system.api.UserService;
import com.zcd.system.dto.UserDto;
import com.zcd.system.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongzuoming <zhongzuoming, 1299076979@qq.com>
 * @version v1.0
 * @Description baipao
 * @encoding UTF-8
 * @date 2019/12/12
 * @time 12:00
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserServiceFeign userServiceFeign;
    @PostMapping("saveUser")
    public ZcdResponseDto saveUser(@RequestBody UserDto userDto){
        ZcdResponseDto zcdResponseDto = new ZcdResponseDto();
        userServiceFeign.saveUser(userDto);
        return zcdResponseDto;
    }
}
