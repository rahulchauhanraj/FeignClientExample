package com.rah.feign.service;

import com.rah.feign.repository.IFeignClientRepository;
import feign.Response;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.io.IOException;

@Service
public class FeignClientService {

    @Inject IFeignClientRepository statusCheckRepository;

    public boolean healthCheck() {
        try {
            Response response = statusCheckRepository.healthCheck();
            if (response.status() == 200) {
                return true;
            }
        } catch (IOException ex) {
            return false;
        }
        return false;
    }

}
