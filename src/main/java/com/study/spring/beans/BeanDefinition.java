package com.study.spring.beans;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName BeanDefinition
 * @Description Bean定义接口
 * @Author zhengjiabin
 * @Date 2022/11/8 16:59
 * @Version 1.0
 **/
public interface BeanDefinition {

    String SCOPE_SINGLETION = "singleton";
    String SCOPE_PROTOTYPE = "prototype";


    /**
     * @author zhengjiabin
     * @description 获取返回bean类名
     * @date 2022/11/8 17:06
     * @return java.lang.Class<?>
     **/
    Class<?> getBeanClass();

    /**
     * @author zhengjiabin
     * @description 获取工厂方法名
     * @date 2022/11/8 17:07
     * @return java.lang.String
     **/
    String getFactoryMethodName();

    /**
     * @author zhengjiabin
     * @description 获取工厂bean名
     * @date 2022/11/8 17:11
     * @return java.lang.String
     **/
    String getFactoryBeanName();

    /**
     * @author zhengjiabin
     * @description 获取Scope
     * @date 2022/11/8 17:16
     * @return java.lang.String
     **/
    String getScope();

    /**
     * @author zhengjiabin
     * @description 是否单例
     * @date 2022/11/8 17:16
     * @return boolean
     **/
    boolean isSingleton();

    /**
     * @author zhengjiabin
     * @description 是否原型
     * @date 2022/11/8 17:17
     * @return boolean
     **/
    boolean isPrototype();

    /**
     * @author zhengjiabin
     * @description 获取初始化方法
     * @date 2022/11/8 17:18
     * @return java.lang.String
     **/
    String getInitMethodName();

    /**
     * @author zhengjiabin
     * @description 销毁方法
     * @date 2022/11/8 17:19
     * @return java.lang.String
     **/
    String getDestroyMethodName();

    boolean isPrimary();

    /**
     * @author zhengjiabin
     * @description 校验bean定义的合法性
     * @date 2022/11/8 17:30
     * @return boolean
     **/
    default boolean validate(){
        // 没定义ckass，工厂bean或工厂方法没指定，则不合法。
        if (this.getBeanClass() == null) {
            if (StringUtils.isBlank(getFactoryBeanName()) || StringUtils.isBlank(getFactoryMethodName())) {
                return false;
            }
        }

        // 定义了类，又定义工厂bean，不合法
        if (this.getBeanClass() != null && StringUtils.isNotBlank(getFactoryBeanName())) {
            return false;
        }
        return true;
    }



}
