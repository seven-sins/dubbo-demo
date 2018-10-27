package org.base.conf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.base.conf.mybatis.DruidConfiguration;
import org.base.conf.mybatis.MyBatisConfig;
import org.base.conf.mybatis.MyBatisMapperScannerConfig;
import org.springframework.context.annotation.Import;


/**
 * 数据源
 * 
 * @author seven sins
 * @date 2018年1月1日 下午7:29:15
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Import({ DruidConfiguration.class, MyBatisConfig.class, MyBatisMapperScannerConfig.class })
public @interface Database {

}
