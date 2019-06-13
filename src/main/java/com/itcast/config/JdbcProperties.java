package com.itcast.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Carl
 * @date 2019/6/12 0012 - 下午 5:17
 */
//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String driverClassName;
    String url;
    String username;
    String password;
}
