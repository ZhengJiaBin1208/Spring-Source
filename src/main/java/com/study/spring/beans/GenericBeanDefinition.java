package com.study.spring.beans;

import org.apache.commons.lang3.StringUtils;


/**
 * @ClassName GenericBeanDefinition
 * @Description BeanDefinition定义实现
 * @Author zhengjiabin
 * @Date 2022/11/8 17:41
 * @Version 1.0
 **/

public class GenericBeanDefinition implements BeanDefinition{

    private Class<?> beanClass;

    private String scope = SCOPE_SINGLETION;

    private String factoryBeanName;

    private String factoryMethodName;

    private String initMethodName;

    private String destroyMethodName;

    private boolean primary;

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public void setScope(String scope) {
        if (StringUtils.isNotBlank(scope)) {
            this.scope = scope;
        }
    }

    public void setFactoryBeanName(String factoryBeanName) {
        this.factoryBeanName = factoryBeanName;
    }

    public void setFactoryMethodName(String factoryMethodName) {
        this.factoryMethodName = factoryMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    /**
     * @return java.lang.Class<?>
     * @author zhengjiabin
     * @description 获取返回bean类名
     * @date 2022/11/8 17:06
     **/
    @Override
    public Class<?> getBeanClass() {
        return this.beanClass;
    }

    /**
     * @return java.lang.String
     * @author zhengjiabin
     * @description 获取工厂方法名
     * @date 2022/11/8 17:07
     **/
    @Override
    public String getFactoryMethodName() {
        return this.factoryMethodName;
    }

    /**
     * @return java.lang.String
     * @author zhengjiabin
     * @description 获取工厂bean名
     * @date 2022/11/8 17:11
     **/
    @Override
    public String getFactoryBeanName() {
        return this.factoryBeanName;
    }

    /**
     * @return java.lang.String
     * @author zhengjiabin
     * @description 获取Scope
     * @date 2022/11/8 17:16
     **/
    @Override
    public String getScope() {
        return this.scope;
    }

    /**
     * @return boolean
     * @author zhengjiabin
     * @description 是否单例
     * @date 2022/11/8 17:16
     **/
    @Override
    public boolean isSingleton() {
        return SCOPE_SINGLETION.equals(this.scope);
    }

    /**
     * @return boolean
     * @author zhengjiabin
     * @description 是否原型
     * @date 2022/11/8 17:17
     **/
    @Override
    public boolean isPrototype() {
        return SCOPE_PROTOTYPE.equals(this.scope);
    }

    /**
     * @return java.lang.String
     * @author zhengjiabin
     * @description 获取初始化方法
     * @date 2022/11/8 17:18
     **/
    @Override
    public String getInitMethodName() {
        return this.initMethodName;
    }

    /**
     * @return java.lang.String
     * @author zhengjiabin
     * @description 销毁方法
     * @date 2022/11/8 17:19
     **/
    @Override
    public String getDestroyMethodName() {
        return this.destroyMethodName;
    }

    @Override
    public boolean isPrimary() {
        return this.primary;
    }


    @Override
    public String toString() {
        return "GenericBeanDefinition{" +
                "beanClass=" + beanClass +
                ", scope='" + scope + '\'' +
                ", factoryBeanName='" + factoryBeanName + '\'' +
                ", factoryMethodName='" + factoryMethodName + '\'' +
                ", initMethodName='" + initMethodName + '\'' +
                ", destroyMethodName='" + destroyMethodName + '\'' +
                ", primary=" + primary +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((beanClass == null) ? 0 : beanClass.hashCode());
        result = prime * result + ((destroyMethodName == null) ? 0 : destroyMethodName.hashCode());
        result = prime * result + ((factoryBeanName == null) ? 0 : factoryBeanName.hashCode());
        result = prime * result + ((factoryMethodName == null) ? 0 : factoryMethodName.hashCode());
        result = prime * result + ((initMethodName == null) ? 0 : initMethodName.hashCode());
        result = prime * result + ((scope == null) ? 0 : scope.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GenericBeanDefinition other = (GenericBeanDefinition) obj;
        if (beanClass == null) {
            if (other.beanClass != null)
                return false;
        } else if (!beanClass.equals(other.beanClass))
            return false;
        if (destroyMethodName == null) {
            if (other.destroyMethodName != null)
                return false;
        } else if (!destroyMethodName.equals(other.destroyMethodName))
            return false;
        if (factoryBeanName == null) {
            if (other.factoryBeanName != null)
                return false;
        } else if (!factoryBeanName.equals(other.factoryBeanName))
            return false;
        if (factoryMethodName == null) {
            if (other.factoryMethodName != null)
                return false;
        } else if (!factoryMethodName.equals(other.factoryMethodName))
            return false;
        if (initMethodName == null) {
            if (other.initMethodName != null)
                return false;
        } else if (!initMethodName.equals(other.initMethodName))
            return false;
        if (scope == null) {
            if (other.scope != null)
                return false;
        } else if (!scope.equals(other.scope))
            return false;
        return true;
    }
}
