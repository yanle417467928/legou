package com.yanle.legou.servicerouter.config.zuul;

import com.yanle.legou.servicerouter.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/16 16:31
 */
@Configuration
public class ZuulConfiguration {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
