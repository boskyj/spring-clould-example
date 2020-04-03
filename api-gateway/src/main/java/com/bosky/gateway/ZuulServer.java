package com.bosky.gateway;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.map.IMap;

import io.github.bucket4j.grid.GridBucketState;

@SpringCloudApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServer {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulServer.class, args);
	}
	@Bean
    @Qualifier("RateLimit")
    public IMap<String, GridBucketState> map() {
        return Hazelcast.newHazelcastInstance().getMap("rateLimit");
    }
	
}
