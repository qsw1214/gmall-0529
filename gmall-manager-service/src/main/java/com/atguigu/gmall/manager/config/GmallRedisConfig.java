package com.atguigu.gmall.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class GmallRedisConfig {
    /**
     *
     * @param factory 这个参数是从容器中自动获取的
     * @return  将我们做好的jedisPool放在容器中
     */
    @Bean
    public JedisPool jedisPoolConfig(JedisConnectionFactory factory) {
        //1、连接工程中所有信息都有
        JedisPoolConfig config = factory.getPoolConfig();
        JedisPool jedisPool = new JedisPool(config, factory.getHostName(), factory.getPort(), factory.getTimeout());
        return jedisPool;
    }

}
