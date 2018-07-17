package com.yanle.legou.customer.domain;

import lombok.*;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 16:05
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    private Long id;

    private String storeName;

    private String address;
}
