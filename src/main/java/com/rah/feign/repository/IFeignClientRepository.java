package com.rah.feign.repository;

import feign.Headers;
import feign.RequestLine;
import feign.Response;

import java.io.IOException;

public interface IFeignClientRepository {

    @RequestLine("GET /search?client=ms-opera-mobile")
    @Headers({"Content-Type: application/x-www-form-urlencoded", "Accept: */*"})
    Response healthCheck() throws IOException;
}
