package com.zcd.system.dto;

import lombok.*;

import java.io.Serializable;

/**
 * @author zhongzuoming <zhongzuoming, 1299076979@qq.com>
 * @version v1.0
 * @Description baipao
 * @encoding UTF-8
 * @date 2019/12/12
 * @time 12:02
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UserDto implements Serializable {

    private static final long serialVersionUID = -7183638587959284469L;

    private String userName;


}
