package com.yanle.legou.customer.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 14:43
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    private static final long serialVersionUID = 6668894005374605101L;
    private Long id;

    private String name;

    private Integer age;

    private Long storeId;
}
