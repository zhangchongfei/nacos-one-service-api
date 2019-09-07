package com.sixi.nacos.oneservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created with IDEA
 *
 * @Description: TODO
 * @Author:zhangchongfei
 * @Date:2019/8/30
 * @Time:15:18
 */
@FeignClient("nacos-one-service")
public interface TestApi {
    @PostMapping("/test")
    String test();
}
