package com.itcast.config;

/*import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;*/

import javax.sql.DataSource;

/**
 * @author Carl
 * @date 2019/6/12 0012 - 下午 5:17
 */

//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

 /*   @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){

        return new DruidDataSource();

    }*/

    //    @Autowired
//    JdbcProperties jdbcProperties;

   /* @Bean
    public DataSource dataSource(JdbcProperties prop){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(prop.getDriverClassName());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());

        return dataSource;
    }*/
}
