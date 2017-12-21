package com.rah.feign.config;

import com.rah.feign.repository.IFeignClientRepository;
import feign.Feign;
import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

@Configuration
public class FeignClientRepositoryConfiguration {

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
                .target(IFeignClientRepository.class, "https://httpbin.org");
    }
}
