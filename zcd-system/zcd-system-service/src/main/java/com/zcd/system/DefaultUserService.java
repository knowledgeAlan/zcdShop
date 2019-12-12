package com.zcd.system;

import com.zcd.system.api.UserService;
import com.zcd.system.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhongzuoming <zhongzuoming, 1299076979@qq.com>
 * @version v1.0
 * @Description
 * @encoding UTF-8
 * @date 2019/12/12
 * @time 12:15
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@RestController
@RequestMapping("userService")
public class DefaultUserService implements UserService {


    @Override
    @PostMapping("saveUser")
    public void saveUser(@RequestBody UserDto userDto) {
        System.out.println("test");
    }

    @GetMapping("selectUser")
    public void selectUser(HttpServletRequest request) {

        System.out.println("端口号:"+request.getServerPort());
    }
}
