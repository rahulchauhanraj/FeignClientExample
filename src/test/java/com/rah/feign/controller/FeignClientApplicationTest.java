package com.rah.feign.controller;

import com.rah.feign.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class FeignClientApplicationTest {

    @Inject FeignClientController feignClientController;

    @Test
    public void testSystemHealth() {
        feignClientController.isAlive();
    }
}
