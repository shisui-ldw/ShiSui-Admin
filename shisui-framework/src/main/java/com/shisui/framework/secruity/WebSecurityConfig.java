package com.shisui.framework.secruity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @projectName: ShiSui-MS
 * @package: com.shisui.framework.secruity
 * @className: WebSecurityConfig
 * @author: lidongwei
 * @description: TODO
 * @date: 2023/7/6 11:07
 * @version: 1.0
 */
@Configuration
@EnableWebSecurity
@EnableGlobalAuthentication()
public class WebSecurityConfig {
}
