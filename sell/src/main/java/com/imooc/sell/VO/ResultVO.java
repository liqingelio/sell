package com.imooc.sell.VO;

import lombok.Data;

/**
 * Http请求返回给最外层的对象
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;
    //错误信息
    private String msg;
    //具体内容
    private T data;
}
