package com.acjava.middleware.dynamic.thread.pool.sdk.domain;

import com.acjava.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @Author loujm  acjava.com @铭轩
 * @Description 动态线程池服务
 * @Date 2024/7/31 下午10:15
 */
public interface IDynamicThreadPoolService {
    /**
     * 获取线程池列表
     */
    List<ThreadPoolConfigEntity> queryThreadPoolList();

    /**
     * 根据线程名字查询线程池配置
     */
    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    /**
     * 更新线程池配置
     */
    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);
}
