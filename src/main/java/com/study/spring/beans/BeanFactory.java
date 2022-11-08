package com.study.spring.beans;

/**
 * @ClassName BeanFactory
 * @Description Bean工厂接口
 * @Author zhengjiabin
 * @Date 2022/11/8 16:57
 * @Version 1.0
 **/
public interface BeanFactory {

    Object getBean(String name) throws Exception;
}
