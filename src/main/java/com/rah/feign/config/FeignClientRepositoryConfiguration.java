package com.rah.feign.config;

import com.rah.feign.repository.IFeignClientRepository;
import feign.Feign;
import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

@Configuration
public class FeignClientRepositoryConfiguration {

    @Value("${feign_client_service_base_url:https//:abc.com}")
    private String serviceUrl;

    @Inject
    Encoder encoder;

    @Inject
    Decoder decoder;

    @Bean
    public IFeignClientRepository feignClientRepository(){

        return Feign.builder()
                .encoder(encoder)
                .decoder(decoder)
                .logLevel(Logger.Level.BASIC)
                .target(IFeignClientRepository.class, serviceUrl);
    }
}
