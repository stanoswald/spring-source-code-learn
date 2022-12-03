package cn.stanoswald.springframework.beans.factory.support;

import cn.stanoswald.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
