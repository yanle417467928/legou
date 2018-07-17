package com.yanle.legou.customer.domain.rpc;

import lombok.*;

import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 15:38
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO<T> implements Serializable {

    private static final long serialVersionUID = -6651857774347310933L;
    private RpcCommonCode code;

    private String message;

    private T  result;
}
