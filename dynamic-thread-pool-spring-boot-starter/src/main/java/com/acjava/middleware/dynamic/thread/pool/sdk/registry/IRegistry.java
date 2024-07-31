package com.acjava.middleware.dynamic.thread.pool.sdk.registry;

import com.acjava.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @Author loujm  acjava.com @铭轩
 * @Description Redis注册中心接口（Redis只是一种注册中心的实现方式）
 * @Date 2024/7/31 下午10:51
 */
public interface IRegistry {
    /**
     * 上报线程池
     */
    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    /**
     * 上报线程池的配置参数
     */
    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);
}
