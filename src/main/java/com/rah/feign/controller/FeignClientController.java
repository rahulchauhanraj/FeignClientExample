package com.rah.feign.controller;

import com.rah.feign.service.FeignClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
public class FeignClientController {

    @Inject private FeignClientService feignClientService;

    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET, produces = "application/json")
    public boolean isAlive() {
        return feignClientService.healthCheck();
    }
}
