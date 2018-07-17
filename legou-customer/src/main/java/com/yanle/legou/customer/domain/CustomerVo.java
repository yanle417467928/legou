package com.yanle.legou.customer.domain;

import lombok.*;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 17:53
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerVo {

    private Long id;

    private String name;

    private Integer age;

    private Long storeId;

    private String storeName;

    private String storeAddress;
}
