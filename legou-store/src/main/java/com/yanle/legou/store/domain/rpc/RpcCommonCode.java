package com.yanle.legou.store.domain.rpc;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 15:41
 */
public enum RpcCommonCode {
    SUCCESS(0, "请求成功"),
    FAILURE(1, "请求失败");

    private int code;

    private String value;

    RpcCommonCode(int code, String value) {
        this.code = code;
        this.value = value;
    }
}
