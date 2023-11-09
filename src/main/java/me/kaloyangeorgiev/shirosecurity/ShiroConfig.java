package me.kaloyangeorgiev.shirosecurity;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setSecurityManager(securityManager);

        HashMap<String, String> filterChain = new HashMap<>();
        filterChain.put("/welcome", "anon");
        filterChain.put("/**", "authcBasic");

        factoryBean.setFilterChainDefinitionMap(filterChain);
        return factoryBean;
    }
}
