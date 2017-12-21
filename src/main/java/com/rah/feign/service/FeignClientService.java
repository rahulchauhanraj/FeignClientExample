package com.rah.feign.service;

import com.rah.feign.repository.IFeignClientRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.io.IOException;

@Service
public class FeignClientService {

    @Inject IFeignClientRepository statusCheckRepository;

    public boolean healthCheck() {
        try {
            statusCheckRepository.healthCheck();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

}
