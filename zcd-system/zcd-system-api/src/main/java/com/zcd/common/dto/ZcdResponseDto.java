package com.zcd.common.dto;

import lombok.*;

import java.io.Serializable;

/**
 * @author zhongzuoming <zhongzuoming, 1299076979@qq.com>
 * @version v1.0
 * @Description
 * @encoding UTF-8
 * @date 2019/12/12
 * @time 13:40
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ZcdResponseDto<T> implements Serializable {

    private static final long serialVersionUID = -7374155775181041911L;

    /**
     *
     * 返回码
     */
    private String returnCode;

    /**
     *
     * 返回信息
     */
    private String message;



    /**
     *
     * 返回数据
     */
    private T data;
}
