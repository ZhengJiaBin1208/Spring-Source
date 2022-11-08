package com.study.spring.beans;

/**
 * @ClassName BeanDefinitionRegistry
 * @Description BeanDefinition注册器
 * @Author zhengjiabin
 * @Date 2022/11/8 17:21
 * @Version 1.0
 **/
public interface BeanDefinitionRegistry {

    /**
     * @author zhengjiabin
     * @description 注册 BeanDefinition
     * @date 2022/11/8 17:24
     * @param beanName Bean名字
     * @param beanDefinition BeanDefinition
     * @return void
     *
     **/
    void  registerBeanDefinition(String beanName, BeanDefinition beanDefinition) ;

    /**
     * @author zhengjiabin
     * @description 获取 BeanDefinition
     * @date 2022/11/8 17:25
     * @param beanName bean名字
     * @return com.study.spring.beans.BeanDefinition
     **/
    BeanDefinition getBeanDefinition(String beanName);
}
